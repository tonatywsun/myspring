package com.yang.aop;

import com.yang.aop.conf.AopComponentScanConf;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: Application
 * @Author: tona.sun
 * @Date: 2019/12/10 14:39
 */
public class Application {
    public static void main(String[] args) {
        //加载配置类,具有解析注解功能，已经不需要开启了
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AopComponentScanConf.class);

    }
}
