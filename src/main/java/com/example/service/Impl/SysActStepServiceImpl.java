package com.example.service.Impl;

import com.alibaba.fastjson.JSON;
import com.example.mapper.SysActStepMapper;
import com.example.pojo.SysActStep;
import com.example.pojo.SysActStepExample;
import com.example.service.SysActStepService;
import com.example.utils.NanChangResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @ClassName SysActStepServiceImpl.java
 * @Description TODO
 * @Author 王凤铎
 * @Date 2019/11/8 14:09
 * @Version 1.0
 */
@Service
public class SysActStepServiceImpl implements SysActStepService {
    @Resource
    private SysActStepMapper sysActStepMapper;


    @Override
    public NanChangResult addActStep(String jsonRequest) {
        List<SysActStep> stepList= JSON.parseArray(jsonRequest,SysActStep.class);
        for (SysActStep step:stepList) {
            step.setCreateTime(new Date());
            step.setUpdateTime(new Date());
            step.setStatus("0");
            sysActStepMapper.insertSelective(step);
        }
        return NanChangResult.ok();
    }

    @Override
    public NanChangResult selectByActId(Long actId) {
        SysActStepExample example=new SysActStepExample();
        SysActStepExample.Criteria criteria=example.createCriteria();
        criteria.andActIdEqualTo(actId);
        List<SysActStep> stepList=sysActStepMapper.selectByExample(example);
        return NanChangResult.ok(stepList);
    }
}
