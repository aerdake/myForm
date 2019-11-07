package com.example.controller;

import com.example.pojo.SysAct;
import com.example.service.SysActService;
import com.example.utils.NanChangResult;
import org.springframework.stereotype.Controller;
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

    @RequestMapping("/add")
    @ResponseBody
    public NanChangResult addSysAct(SysAct sysAct){
        NanChangResult result=sysActService.addSysAct(sysAct);
        return result;
    }

}
