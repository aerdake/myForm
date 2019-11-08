package com.example.service;

import com.example.pojo.SysAct;
import com.example.utils.NanChangResult;

/**
 * @ClassName SysActService.java
 * @Description TODO
 * @Author 王凤铎
 * @Date 2019/11/6 14:19
 * @Version 1.0
 */
public interface SysActService {

    NanChangResult addSysAct(SysAct sysAct);

    NanChangResult selectOne(SysAct sysAct);
}
