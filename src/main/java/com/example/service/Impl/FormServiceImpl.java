package com.example.service.Impl;

import com.alibaba.fastjson.JSON;
import com.example.mapper.SysActFormMapper;
import com.example.mapper.SysActMapper;
import com.example.mapper.SysActStepMapper;
import com.example.pojo.SysAct;
import com.example.pojo.SysActForm;
import com.example.pojo.SysActStep;
import com.example.service.FormService;
import com.example.utils.NanChangResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName FormServiceImpl.java
 * @Description TODO
 * @Author 杨航
 * @Date 2019/11/8 13:53
 * @Version 1.0
 */
@Service
public class FormServiceImpl implements FormService {
    @Resource
    SysActFormMapper sysActFormMapper;
    @Resource
    SysActMapper sysActMapper;
    @Resource
    SysActStepMapper sysActStepMapper;
    @Override
    public NanChangResult saveAct(String formData,String actStepData,String actData) {
        List<SysActForm> sysActForms = JSON.parseArray(formData, SysActForm.class);
        for (SysActForm sysActForm:sysActForms){
            sysActFormMapper.insert(sysActForm);
        }
        List<SysActStep> sysActSteps = JSON.parseArray(actStepData, SysActStep.class);
        for (SysActStep sysActStep :sysActSteps){
            sysActStepMapper.insert(sysActStep);
        }
        SysAct sysAct = JSON.parseObject(actData, SysAct.class);
        sysActMapper.insert(sysAct);
        return NanChangResult.ok();
    }


}
