package com.yang;

import com.yang.conf.ComponentScanConf;
import com.yang.entry.Teacher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: Application
 * @Author: tona.sun
 * @Date: 2019/12/10 14:39
 */
public class Application {
    public static void main(String[] args) {
        //加载配置类,具有解析注解功能，已经不需要开启了
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ComponentScanConf.class);
        //加载xml
        //ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
        Teacher teacher = (Teacher) annotationConfigApplicationContext.getBean("teacher");
        System.out.println(teacher);
    }
}
