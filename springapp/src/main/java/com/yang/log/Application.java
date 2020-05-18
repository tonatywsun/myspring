package com.yang.log;

import com.yang.log.app.Configer;
import com.yang.log.services.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/15 14:35
 */
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(Configer.class);
        annotationConfigApplicationContext.start();
        Object indexServiceImpl = annotationConfigApplicationContext.getBean("indexServiceImpl");
        System.out.println(indexServiceImpl);
        Map<String, IndexService> beansOfType = annotationConfigApplicationContext.getBeansOfType(IndexService.class);
    }
}
