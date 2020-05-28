package com.yang.test;

import com.yang.test.service.CityService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description: Application
 * @Author: tona.sun
 * @Date: 2019/12/10 14:39
 */
@Configurable
@ComponentScan(value = "com.yang.test")
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Application.class);
        CityService bean = annotationConfigApplicationContext.getBean(CityService.class);
        bean.queryAll("ACityDaoImpl");
        bean.queryAll("BCityDaoImpl");
    }
}
