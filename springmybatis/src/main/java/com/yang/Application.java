package com.yang;

import com.yang.Services.CityService;
import com.yang.conf.DataSourceConfig;
import com.yang.dao.entry.City;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/18 15:22
 */

public class Application {
    public static void main(String[] args) {
        //指定使用日志
        LogFactory.useLog4JLogging();
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(DataSourceConfig.class);
        annotationConfigApplicationContext.start();
        CityService cityService = annotationConfigApplicationContext.getBean(CityService.class);
        //两次查询打印两条sql，mybatis集成spring一级缓存失效，执行两次sql
        //mapper加@CacheNamespace注解可开启二级缓存，但是city要实现序列化
        List<City> cities = cityService.selectAllCity();
        List<City> cities2 = cityService.selectAllCity();
        System.out.println(cities.size());
    }
}
