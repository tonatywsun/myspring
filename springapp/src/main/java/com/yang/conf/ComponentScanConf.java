package com.yang.conf;

import org.springframework.context.annotation.ImportResource;

/**
 * @Description: java配置类，javaconfig代替xml
 * @Author: tona.sun
 * @Date: 2019/12/10 16:40
 */
//@ComponentScan("com.yang")
//引用xml中的配置，实现注解 xml 和java配置类三种并存配置，只是自己测试玩玩而已
@ImportResource("classpath:application.xml")
public class ComponentScanConf {
}