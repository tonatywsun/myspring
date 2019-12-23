package com.yang.factory;

import com.yang.factory.conf.AopComponentScanConf;
import com.yang.factory.dao.IUserDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
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
    public static void main(String[] args) throws Exception {
        //BeanFactory是一个用于取容器中对象的工厂
        BeanFactory annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AopComponentScanConf.class);
        IUserDao userDao = (IUserDao) annotationConfigApplicationContext.getBean("myFactoryBean");
        IUserDao userDao2 = (IUserDao) annotationConfigApplicationContext.getBean("myFactoryBean");
        FactoryBean myFactoryBean = (FactoryBean) annotationConfigApplicationContext.getBean("&myFactoryBean");
        System.out.println(userDao.equals(myFactoryBean.getObject()));
        System.out.println(userDao.equals(userDao2));
    }
}
