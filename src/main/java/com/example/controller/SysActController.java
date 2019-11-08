package com.example.controller;

import com.example.pojo.SysAct;
import com.example.service.SysActService;
import com.example.utils.NanChangResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @ClassName SysActController.java
 * @Description TODO
 * @Author 王凤铎
 * @Date 2019/11/6 10:40
 * @Version 1.0
 */
@Controller
@RequestMapping("/act")
public class SysActController {
    @Resource
    private SysActService sysActService;


    /**
     * 流程的定义新增
     * @param sysAct
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public NanChangResult addSysAct(@RequestBody SysAct sysAct){
        NanChangResult result=sysActService.addSysAct(sysAct);
        return result;
    }


    /**
     * 根据ID查询流程进行数据回显
     * @param sysAct
     * @return
     */
    @RequestMapping("/selectOne")
    @ResponseBody
    public NanChangResult selectOne(SysAct sysAct){
        NanChangResult result=sysActService.selectOne(sysAct);
        return result;
    }



}
