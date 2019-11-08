package com.example.service;

import freemarker.template.TemplateException;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName GenerateService.java
 * @Description TODO
 * @Author 杨航
 * @Date 2019/11/6 10:50
 * @Version 1.0
 */
public interface GenerateService {
    public Boolean generateHtml() throws IOException, TemplateException;


}
