package com.example.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SysActForm implements Serializable {
    private Long actFormId;

    private Long actId;

    private String fieldId;

    private String fieldClass;

    private String fieldDatakey;

    private String fieldFilter;

    private String fieldLabel;

    private String fieldTag;

    private String fieldType;

    private String dataType;

    private String fieldPlaceholder;

    private Integer fieldLength;

    private String isHidden;

    private String isRequired;

    private String validate;

    private String fieldStyle;

    private String fieldAttribute;

    private String status;

    private Date createTime;

    private Date updateTime;

    private String remark;

    private String recycle;

    private static final long serialVersionUID = 1L;
}