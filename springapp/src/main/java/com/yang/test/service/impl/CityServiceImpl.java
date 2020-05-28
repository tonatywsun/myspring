package com.yang.test.service.impl;

import com.yang.test.dao.mapper.CityDao;
import com.yang.test.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/28 12:03
 */
@Service
public class CityServiceImpl implements CityService {
    //卧槽，spring竟然可以把两个CityDao注入到一个map中,
    @Autowired
    Map<String, CityDao> cityDaoMap;
    //我擦，spring竟然可以把所有的类型注入到map中
    @Autowired
    Map<String, Object> objectMap;

    //卧槽，spring竟然可以把两个CityDao注入到一个list中,
    @Autowired
    List<CityDao> cityDaoList;
    //我擦，spring竟然可以把所有的类型注入到list中
    @Autowired
    List<Object> objectList;

    @Override
    public void queryAll(String type) {
        Optional.ofNullable(cityDaoMap.get(type)).ifPresent(cityDao -> cityDao.queryAll());
    }
}
