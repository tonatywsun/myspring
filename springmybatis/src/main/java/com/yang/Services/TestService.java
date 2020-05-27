package com.yang.Services;

import org.springframework.stereotype.Service;

/**
 * @Description: 就是一个测试用的services类，本类中私有属性CityService cityService;没有自动注入
 * @Author: tona.sun
 * @Date: 2020/05/25 11:03
 */
@Service
public class TestService {
    private CityService cityService;

    public CityService getCityService() {
        return cityService;
    }

    public void setCityService(CityService cityService) {
        this.cityService = cityService;
    }
}
