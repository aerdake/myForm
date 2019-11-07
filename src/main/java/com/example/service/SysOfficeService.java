package com.example.service;

import com.example.pojo.SysOffice;
import com.example.utils.Ztree;

import java.util.List;

/**
 * @ClassName SysOfficeService.java
 * @Description TODO
 * @Author 王凤铎
 * @Date 2019/11/6 15:41
 * @Version 1.0
 */

public interface SysOfficeService {
    List<SysOffice> selectOfficeList();

    List<Ztree> officeTreeData();
}
