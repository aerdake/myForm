package com.example.pojo;

import com.example.utils.BasePage;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysMenu extends BasePage implements Serializable {
    private Long menuId;

    private String menuName;

    private String menuRank;

    private Long parentId;

    private Integer sort;

    private String url;

    private String status;

    private Date createDate;

    private Date updateDate;

    private String remark;

    private String recycle;

    private static final long serialVersionUID = 1L;
}