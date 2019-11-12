package com.example.service.Impl;

import com.alibaba.fastjson.JSONArray;
import com.example.mapper.*;
import com.example.pojo.*;
import com.example.service.SysActService;
import com.example.utils.NanChangResult;
import com.example.utils.Ztree;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @ClassName SysActServiceImpl.java
 * @Description TODO
 * @Author 王凤铎
 * @Date 2019/11/6 14:20
 * @Version 1.0
 */
@Service
public class SysActServiceImpl implements SysActService {

    @Resource
    private SysActMapper sysActMapper;
    @Resource
    private SysUserMapper sysUserMapper;
    @Resource
    private SysOfficeMapper sysOfficeMapper;
    @Resource
    private SysOfficeUserMapper sysOfficeUserMapper;
    @Resource
    private MyMapper myMapper;

    /**
     * 流程添加
     * @param sysAct
     * @return
     */
    @Override
    public NanChangResult addSysAct(SysAct sysAct) {
        sysAct.setCreateTime(new Date());
        sysAct.setUpdateTime(new Date());
        if(sysAct.getApplyUserRange()==null){
            //如果申请人范围为空，设置为所有人
            sysAct.setApplyUserRange("0");
        }
        sysActMapper.insertSelective(sysAct);
        return NanChangResult.ok();
    }

    /**
     * 单个流程查询（数据回显）
     * @param sysAct
     * @return
     */
    @Override
    public NanChangResult selectOne(SysAct sysAct) {
        //SysAct ss=sysActMapper.selectByPrimaryKey(sysAct.getActId());
        String[] uIds=sysAct.getUserIds().split(",");
        String[] offIds=sysAct.getOfficeIds().split(",");
        List<Ztree> ztreeList=new ArrayList<>();
        List<Ztree> ztreeList2=new ArrayList<>();
        if(sysAct.getUserIds()!=null ){
            //遍历用户ID数组，拼成ztree结构存入对象
            for (String uid:uIds) {
                SysUser user=sysUserMapper.selectByPrimaryKey(Long.parseLong(uid));
                Ztree ztree=new Ztree();
                ztree.setId(Long.parseLong(uid));
                ztree.setName(user.getEmployeeName());
                //获取部门ID
                SysOfficeUserExample example=new SysOfficeUserExample();
                SysOfficeUserExample.Criteria criteria=example.createCriteria();
                criteria.andUserIdEqualTo(user.getUserId());
                List<SysOfficeUser> list=sysOfficeUserMapper.selectByExample(example);
                //ztree的PID存入部门ID
                ztree.setpId(list.get(0).getOfficeId());
                ztreeList.add(ztree);
            }
            String str=JSONArray.toJSONString(ztreeList);
            sysAct.setUserIds(str);
        }
        if(sysAct.getOfficeIds()!=null){
            for (String offId:offIds) {
                SysOffice office=sysOfficeMapper.selectByPrimaryKey(Long.parseLong(offId));
                Ztree ztree2=new Ztree();
                ztree2.setId(Long.parseLong(offId));
                ztree2.setName(office.getOfficeName());
                ztree2.setpId(0L);
                ztreeList2.add(ztree2);
            }
            String str2=JSONArray.toJSONString(ztreeList2);
            sysAct.setOfficeIds(str2);
        }

        return NanChangResult.ok(sysAct);
    }

    /**
     * 根据ID查询单个
     * @param actId
     * @return
     */
    @Override
    public NanChangResult selectActById(Long actId) {
        SysAct sysAct=sysActMapper.selectByPrimaryKey(actId);
        return NanChangResult.ok(sysAct);
    }

    /**
     * 判断数据库中表名是否存在
     * @param tbName
     * @return
     */
    @Override
    public NanChangResult tbNameIsExists(String tbName) {
        String dbName="nanchang-lamp";
        int count=myMapper.isTableExist(dbName,tbName);
        if(count>0){
            return NanChangResult.error("表名已存在！");
        }else{
            return NanChangResult.ok();
        }

    }


}
