package com.example.service.Impl;

import com.example.mapper.SysActFormMapper;
import com.example.mapper.SysMenuMapper;
import com.example.pojo.SysActForm;
import com.example.pojo.SysActFormExample;
import com.example.pojo.SysMenu;
import com.example.pojo.SysMenuExample;
import com.example.service.GenerateService;
import com.example.utils.MenuTree;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName GeberateServiceImpl.java
 * @Description TODO
 * @Author 杨航
 * @Date 2019/11/6 10:49
 * @Version 1.0
 */
@Service
public class GeberateServiceImpl implements GenerateService {
    @Resource
    SysActFormMapper sysActFormMapper;
    @Resource
    SysMenuMapper sysMenuMapper;
    @Override
    public Boolean generateHtml() throws IOException, TemplateException {
        // 第一步：创建一个Configuration对象，直接new一个对象。构造方法的参数就是freemarker对于的版本号。
        Configuration configuration = new Configuration(Configuration.getVersion());
        // 第二步：设置模板文件所在的路径。
        configuration.setDirectoryForTemplateLoading(new File("src/main/resources/templates"));
        // 第三步：设置模板文件使用的字符集。一般就是utf-8.
        configuration.setDefaultEncoding("utf-8");
        // 第四步：加载一个模板，创建一个模板对象。
        Template template = configuration.getTemplate("template.ftl");
        // 第五步：创建一个模板使用的数据集，可以是pojo也可以是map。一般是Map。
        Map<String, Object> dataModel = new HashMap<>();
        //向数据集中添加数据

        SysActFormExample sysActFormExample = new SysActFormExample();
        SysActFormExample.Criteria criteria = sysActFormExample.createCriteria();
        criteria.andActIdEqualTo(1L);
        List<SysActForm> sysActForms = sysActFormMapper.selectByExample(sysActFormExample);
        List<Map> array = new ArrayList<>();
        for (SysActForm item : sysActForms) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("field", item.getFieldDatakey());
            map.put("title", item.getFieldLabel());
            array.add(map);
        }
        dataModel.put("fieldData", array);
        // 第六步：创建一个Writer对象，一般创建一FileWriter对象，指定生成的文件名。
        Writer out = new FileWriter(new File("src/main/resources/templates/result.html"));
        // 第七步：调用模板对象的process方法输出文件。
        template.process(dataModel, out);
        // 第八步：关闭流。
        out.close();
        return true;
    }





}
