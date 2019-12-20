package com.yang.aop;

import com.yang.aop.Service.UserService;
import com.yang.aop.conf.AopComponentScanConf;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description: Application
 * @Author: tona.sun
 * @Date: 2019/12/10 14:39
 */
@Configuration
@EnableAspectJAutoProxy
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AopComponentScanConf.class);
        UserService userService = (UserService) annotationConfigApplicationContext.getBean("userServiceImpl");
        userService.getAllUser();
        userService.getAllUser();
    }
}
