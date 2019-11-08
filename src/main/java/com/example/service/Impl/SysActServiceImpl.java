package com.example.service.Impl;

import com.alibaba.fastjson.JSONArray;
import com.example.mapper.SysActMapper;
import com.example.mapper.SysUserMapper;
import com.example.pojo.SysAct;
import com.example.pojo.SysUser;
import com.example.service.SysActService;
import com.example.utils.NanChangResult;
import com.example.utils.Ztree;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
     * 单个流程查询
     * @param sysAct
     * @return
     */
    @Override
    public NanChangResult selectOne(SysAct sysAct) {
        SysAct ss=sysActMapper.selectByPrimaryKey(sysAct.getActId());
        String[] uIds=ss.getUserIds().split(",");
        String[] offIds=ss.getOfficeIds().split(",");
        List<Ztree> ztreeList=new ArrayList<>();
        if(ss.getUserIds()!=null ){
            for (String uid:uIds) {
                SysUser user=sysUserMapper.selectByPrimaryKey(Long.parseLong(uid));
                Ztree ztree=new Ztree();
                ztree.setId(Long.parseLong(uid));
                ztree.setName(user.getEmployeeName());
                //ztree.setpId(user.get);
                ztreeList.add(ztree);
            }
            String str=JSONArray.toJSONString(ztreeList);
            ss.setUserIds(str);
        }
        if(ss.getOfficeIds()!=null){
            for (String offId:offIds) {

            }
        }

        return NanChangResult.ok(ss);
    }





}
