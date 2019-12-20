package com.yang.aop.conf;

/**
 * @Description: java配置类，javaconfig代替xml
 * @Author: tona.sun
 * @Date: 2019/12/16 16:59
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(value = "com.yang.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopComponentScanConf {
}
