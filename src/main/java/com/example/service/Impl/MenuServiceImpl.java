package com.example.service.Impl;

import com.example.mapper.SysMenuMapper;
import com.example.pojo.SysMenu;
import com.example.pojo.SysMenuExample;
import com.example.service.MenuService;
import com.example.utils.Ztree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MenuServiceImpl.java
 * @Description TODO
 * @Author 王凤铎
 * @Date 2019/11/6 10:16
 * @Version 1.0
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    /**
     * 查询所有菜单集合
     * @return
     */
    @Override
    public List<SysMenu> selectMenuList() {
        SysMenuExample example = new SysMenuExample();
        SysMenuExample.Criteria criteria = example.createCriteria();
        criteria.andRecycleEqualTo("0");
        List<SysMenu> menuList =sysMenuMapper.selectByExample(example);
        return menuList;
    }

    /**
     * 查询所有菜单树
     * @return
     */
    @Override
    public List<Ztree> menuTreeData() {
        List<SysMenu> menuList = selectMenuList();
        List<Ztree> ztrees = initZtree(menuList);
        return ztrees;
    }

    /**
     * 构建树
     * @param menuList
     * @return
     */
    private List<Ztree> initZtree(List<SysMenu> menuList) {
        List<Ztree> ztrees = new ArrayList<Ztree>();
        for (SysMenu menu : menuList) {
            Ztree ztree = new Ztree();
            ztree.setId(menu.getMenuId());
            ztree.setpId(menu.getParentId());
            ztree.setName(menu.getMenuName());
            ztree.setTitle(menu.getMenuName());
            ztree.setUrl(menu.getUrl());
            ztrees.add(ztree);
        }
        return ztrees;
    }

}
