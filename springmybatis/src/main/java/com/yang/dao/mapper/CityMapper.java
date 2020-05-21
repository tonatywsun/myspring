package com.yang.dao.mapper;

import com.yang.dao.entry.City;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/18 15:28
 */
//@CacheNamespace
//@Mapper
public interface CityMapper {
    @Select("select * from t_city")
    List<City> selectAll();

    @Select("select * from t_city where id=#{id}")
    City selectById(@Param("id") Integer id);
}
