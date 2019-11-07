package com.example.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SysOffice implements Serializable {
    private Long officeId;

    private String officeName;

    private String address;

    private String phone;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private String status;

    private String recycle;

    private static final long serialVersionUID = 1L;
}