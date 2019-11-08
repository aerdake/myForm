package com.example.controller;

import com.example.service.SysActStepService;
import com.example.utils.NanChangResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName SysActStepController.java
 * @Description TODO
 * @Author 王凤铎
 * @Date 2019/11/8 14:06
 * @Version 1.0
 */
@Controller
@RequestMapping("/actStep")
public class SysActStepController {

    @Autowired
    private SysActStepService sysActStepService;

    @RequestMapping("/add")
    public NanChangResult addActStep(@RequestBody String jsonRequest){
        NanChangResult result=sysActStepService.addActStep(jsonRequest);
        return result;
    }



}
