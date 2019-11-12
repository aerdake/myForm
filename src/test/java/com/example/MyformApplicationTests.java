package com.example;

import com.example.service.GenerateService;
import freemarker.template.TemplateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyformApplicationTests {
    @Autowired
    GenerateService generateService;
    @Test
    public void contextLoads() throws IOException, TemplateException {
        generateService.generateHtml();
    }

}
