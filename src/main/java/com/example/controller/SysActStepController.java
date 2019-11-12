package com.example.controller;

import com.example.service.SysActStepService;
import com.example.utils.NanChangResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName SysActStepController.java
 * @Description TODO
 * @Author 王凤铎
 * @Date 2019/11/8 14:06
 * @Version 1.0
 */

@RequestMapping("/actStep")
@Controller
public class SysActStepController {

    @Autowired
    private SysActStepService sysActStepService;

    /**
     * 流程新增
     * @param jsonRequest
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public NanChangResult addActStep(@RequestBody String jsonRequest){
        NanChangResult result=sysActStepService.addActStep(jsonRequest);
        return result;
    }


    @RequestMapping(value = "/selectByActId/{actId}",method = RequestMethod.GET)
    @ResponseBody
    public NanChangResult selectByActId(@PathVariable Long actId){
        NanChangResult result=sysActStepService.selectByActId(actId);
        return result;
    }


}
