package com.example.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @ClassName NanChangResult.java
 * @Description TODO
 * @Author 王凤铎
 * @Date 2019/11/6 14:23
 * @Version 1.0
 */
@Getter
@Setter
public class NanChangResult {

    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    /** 状态码 **/
    private Integer code;

    /** 提示信息 **/
    private String msg;

    /** 返回的数据总数 **/
    private Long count;

    /** 响应数据 **/
    private Object data;

    public NanChangResult() {}

    public NanChangResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public NanChangResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public NanChangResult(Integer code, String msg, Long count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }



    public static NanChangResult ok() {
        return new NanChangResult(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage());
    }

    public static NanChangResult ok(Object data) {
        return new NanChangResult(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), data);
    }

    public static NanChangResult ok(Long count, Object data) {
        return new NanChangResult(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), count, data);
    }

    public static NanChangResult error(){
        return new NanChangResult(ResultEnum.ERROR.getCode(), ResultEnum.ERROR.getMessage(), null);
    }

    public static NanChangResult error(String msg){
        return error(ResultEnum.ERROR.getCode(), msg);
    }

    public static NanChangResult error(Integer code, String msg){
        return new NanChangResult(code, msg, null);
    }

    public static NanChangResult build(Integer code, String msg) {
        return new NanChangResult(code, msg);
    }

    public static NanChangResult build(Integer code, String msg, Object data) {
        return new NanChangResult(code, msg, data);
    }

    public static NanChangResult build(Integer code, String msg, Long count, Object data) {
        return new NanChangResult(code, msg, count, data);
    }



    /**
     * 将json结果集转化为TaotaoResult对象
     *
     * @param jsonData json数据
     * @param clazz TaotaoResult中的object类型
     * @return
     */
    public static NanChangResult formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, NanChangResult.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (clazz != null) {
                if (data.isObject()) {
                    obj = MAPPER.readValue(data.traverse(), clazz);
                } else if (data.isTextual()) {
                    obj = MAPPER.readValue(data.asText(), clazz);
                }
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 没有object对象的转化
     *
     * @param json
     * @return
     */
    public static NanChangResult format(String json) {
        try {
            return MAPPER.readValue(json, NanChangResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Object是集合转化
     *
     * @param jsonData json数据
     * @param clazz 集合中的类型
     * @return
     */
    public static NanChangResult formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }
}
