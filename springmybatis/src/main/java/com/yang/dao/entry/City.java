package com.yang.dao.entry;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

/**
 * @Description: 实体类, 二级缓存时需要实现序列化
 * @Author: tona.sun
 * @Date: 2020/05/18 15:27
 */
public class City implements Serializable {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
