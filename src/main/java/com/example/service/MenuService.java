package com.example.service;

import com.example.pojo.SysMenu;
import com.example.utils.Ztree;

import java.util.List;

/**
 * @ClassName MenuService.java
 * @Description TODO
 * @Author 王凤铎
 * @Date 2019/11/6 10:04
 * @Version 1.0
 */

public interface MenuService {
    List<Ztree> menuTreeData();

    List<SysMenu> selectMenuList();
}
