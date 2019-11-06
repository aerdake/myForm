package com.example.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SysAct implements Serializable {
    private Long actId;

    private String actName;

    private String discripe;

    private String applyUserRange;

    private String officeIds;

    private String userIds;

    private String formHtml;

    private String formFieldId;

    private String tbName;

    private Date startTime;

    private Date endTime;

    private String status;

    private Date createTime;

    private Date updateTime;

    private String createPerson;

    private String updatePerson;

    private String remark;

    private String recycle;

    private static final long serialVersionUID = 1L;
}