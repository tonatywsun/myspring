package com.yang.aop.conf;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Description: 切面
 * @Author: tona.sun
 * @Date: 2019/12/20 10:52
 */
//配置一个切面
@Configuration
//perthis可以指定UserServiceImpl的切面是原型模式，但是这里测试失败了
@Aspect(/*"perthis(this(com.yang.aop.Service.impl.UserServiceImpl()))"*/)
@Scope("prototype")
public class NotVeryUsefulAspect {
    //一个切点 只测试了within，还有好多其他的
    @Pointcut("within(com.yang.aop.Service..*)")
    private void withinService() {
    }

    //一个通知
    @Before("withinService()")
    private void withinServiceBefor() {
        System.out.println("withinServiceBefor");
    }

    @After("withinService()")
    private void withinServiceAfter() {
        System.out.println(this);
        System.out.println("withinServiceAfter");
    }
}
