package com.example.controller;

import com.example.service.FormService;
import com.example.utils.NanChangResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


/**
 * @ClassName FormController.java
 * @Description TODO
 * @Author 杨航
 * @Date 2019/9/24 9:17
 * @Version 1.0
 */
@Controller
public class FormController {
    @RequestMapping("form")
    public String form(){
        return "build";
    }

    @Autowired
    FormService formService;

    //保存表单
    @RequestMapping("/act/save")
    public NanChangResult saveAct(String formData,String actStepData,String actData){

        return formService.saveAct(formData,actStepData,actData);
    }
}
