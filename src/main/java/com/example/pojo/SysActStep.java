package com.example.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SysActStep implements Serializable {
    private Long id;

    private Long actStepId;

    private Long actId;

    private String stepName;

    private String stepNodeType;

    private String approveUserType;

    private String rolesApproveType;

    private String approveUser;

    private String roleUser;

    private String roleForm;

    private String judge;

    private Integer priority;

    private String nextNode;

    private String disagreeSelect;

    private String disagreeNode;

    private String status;

    private Date createTime;

    private Date updateTime;

    private String createPerson;

    private String updatePerson;

    private String remark;

    private String recycle;

    private static final long serialVersionUID = 1L;
}