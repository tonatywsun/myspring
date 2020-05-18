package com.yang.Services.impl;

import com.yang.Services.CityService;
import com.yang.dao.entry.City;
import com.yang.dao.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/18 15:42
 */
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<City> selectAllCity() {
        //LogFactory.useLog4JLogging();
        return cityMapper.selectAll();
    }
}
