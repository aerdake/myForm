package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


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

    @RequestMapping("tree")
    public String tree(){
        return "treetest";
    }
}
