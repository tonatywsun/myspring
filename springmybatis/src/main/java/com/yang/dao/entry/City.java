package com.yang.dao.entry;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/18 15:27
 */
@Data
public class City implements Serializable {
    private Integer id;
    private String name;
}
