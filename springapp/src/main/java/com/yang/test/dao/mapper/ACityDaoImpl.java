package com.yang.test.dao.mapper;

import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/28 12:02
 */
@Component
public class ACityDaoImpl implements CityDao{
    @Override
    public void queryAll() {
        System.out.println("a city dao");
    }
}
