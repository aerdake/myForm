package com.example.utils;

import java.io.Serializable;

/**
 * @ClassName BasePage.java
 * @Description TODO
 * @Author 王凤铎
 * @Date 2019/11/6 13:23
 * @Version 1.0
 */
public class BasePage implements Serializable {
    /** 页数 **/
    Integer page;

    /** 条数 **/
    Integer limit;
}
