package com.example.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName ResultEnum.java
 * @Description TODO
 * @Author 王凤铎
 * @Date 2019/11/6 14:25
 * @Version 1.0
 */
@Getter
@AllArgsConstructor
public enum ResultEnum {
    /**
     * @Code 200
     * @Message "成功"
     */
    SUCCESS(200, "成功"),

    /**
     * @Code 500
     * @Message "失败"
     */
    ERROR(500, "失败");

    private Integer code;

    private String message;
}
