package com.example.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SysUser implements Serializable {
    private Long userId;

    private String userName;

    private String password;

    private String superPassword;

    private String employeeName;

    private String sex;

    private Integer age;

    private String card;

    private String phone;

    private String mail;

    private String jobNum;

    private String isLeader;

    private Long leaderId;

    private Date hireDate;

    private String remark;

    private String status;

    private Integer online;

    private Date createTime;

    private Date updateTime;

    private String recycle;

    private static final long serialVersionUID = 1L;
}