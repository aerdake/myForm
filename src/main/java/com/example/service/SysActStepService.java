package com.example.service;

import com.example.utils.NanChangResult;

/**
 * @ClassName SysActStepService.java
 * @Description TODO
 * @Author 王凤铎
 * @Date 2019/11/8 14:08
 * @Version 1.0
 */
public interface SysActStepService {
    NanChangResult addActStep(String jsonRequest);

    NanChangResult selectByActId(Long actId);
}
