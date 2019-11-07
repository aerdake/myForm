package com.example.service.Impl;


import com.example.mapper.SysOfficeMapper;
import com.example.mapper.SysOfficeUserMapper;
import com.example.mapper.SysUserMapper;
import com.example.pojo.*;
import com.example.service.SysOfficeService;
import com.example.utils.Ztree;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SysOfficeServiceImpl.java
 * @Description TODO
 * @Author 王凤铎
 * @Date 2019/11/6 15:41
 * @Version 1.0
 */
@Service
public class SysOfficeServiceImpl implements SysOfficeService {

    @Resource
    private SysOfficeMapper sysOfficeMapper;
    @Resource
    private SysUserMapper sysUserMapper;
    @Resource
    private SysOfficeUserMapper sysOfficeUserMapper;

    /**
     * 查询部门列表
     * @return
     */
    @Override
    public List<SysOffice> selectOfficeList() {
        SysOfficeExample example=new SysOfficeExample();
        SysOfficeExample.Criteria criteria=example.createCriteria();
        criteria.andRecycleEqualTo("0");
        List<SysOffice> officeList=sysOfficeMapper.selectByExample(example);
        return officeList;
    }

    /**
     * 查询所有部门树
     * @return
     */
    @Override
    public List<Ztree> officeTreeData() {
        List<SysOffice> officeList=selectOfficeList();
        SysOfficeUserExample example=new SysOfficeUserExample();
        List<SysOfficeUser> officeUserList=sysOfficeUserMapper.selectByExample(example);
        List<Ztree> ztrees = initZtree(officeList,officeUserList);
        return ztrees;
    }

    private List<Ztree> initZtree(List<SysOffice> officeList, List<SysOfficeUser> officeUserList) {
        List<Ztree> ztrees = new ArrayList<Ztree>();
        for(SysOffice office:officeList){
            Ztree ztree=new Ztree();
            ztree.setId(office.getOfficeId());
            ztree.setpId(0L);
            ztree.setName(office.getOfficeName());
            ztrees.add(ztree);
        }
        for(SysOfficeUser officeUser:officeUserList){
            SysUser user=sysUserMapper.selectByPrimaryKey(officeUser.getUserId());
            Ztree ztree2=new Ztree();
            ztree2.setId(officeUser.getUserId());
            ztree2.setName(user.getEmployeeName());
            ztree2.setpId(officeUser.getOfficeId());
            ztrees.add(ztree2);
        }
        return ztrees;

    }
}
