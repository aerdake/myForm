package com.example.controller;

import com.example.pojo.SysMenu;
import com.example.service.MenuService;
import com.example.utils.Ztree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName MenuController.java
 * @Description TODO
 * @Author 王凤铎
 * @Date 2019/11/6 10:12
 * @Version 1.0
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;


    @RequestMapping("/list")
    @ResponseBody
    public List<SysMenu> list(){
        List<SysMenu> menuList = menuService.selectMenuList();
        return menuList;
    }


    /**
     * 加载所有菜单列表树
     */
    @RequestMapping("/menuTreeData")
    @ResponseBody
    public List<Ztree> menuTreeData(){
        List<Ztree> ztrees = menuService.menuTreeData();
        return ztrees;
    }

}
