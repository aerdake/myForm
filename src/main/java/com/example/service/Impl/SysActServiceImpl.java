package com.example.service.Impl;

import com.example.mapper.SysActMapper;
import com.example.pojo.SysAct;
import com.example.service.SysActService;
import com.example.utils.NanChangResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

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

}
