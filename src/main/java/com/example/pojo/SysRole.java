package com.example.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SysRole implements Serializable {
    private Long roleId;

    private String roleName;

    private String roleDesc;

    private String status;

    private Date createTime;

    private Date updateTime;

    private String recycle;

    private static final long serialVersionUID = 1L;
}