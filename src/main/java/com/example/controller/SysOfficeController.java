package com.example.controller;

import com.example.pojo.SysOffice;
import com.example.service.SysOfficeService;
import com.example.utils.Ztree;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName SysOfficeController.java
 * @Description TODO
 * @Author 王凤铎
 * @Date 2019/11/6 15:41
 * @Version 1.0
 */
@RequestMapping("/office")
@Controller
public class SysOfficeController {
    @Resource
    private SysOfficeService sysOfficeService;

    /**
     * 查询所有部门列表
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<SysOffice> officeList(){
        List<SysOffice> officeList=sysOfficeService.selectOfficeList();
        return officeList;
    }

    /**
     * 部门菜单树
     * @return
     */
    @RequestMapping("/officeTreeData")
    @ResponseBody
    public List<Ztree> officeTreeData(){
        List<Ztree> ztrees=sysOfficeService.officeTreeData();
        return ztrees;
    }

}
