package com.example.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class SysOfficeUser implements Serializable {
    private Long userId;

    private Long officeId;

    private static final long serialVersionUID = 1L;
}