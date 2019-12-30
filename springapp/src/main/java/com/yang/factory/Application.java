package com.yang.factory;

import com.yang.factory.dao.IUserDao;
import com.yang.factory.dao.UserDaoImpl;
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
        /*//BeanFactory是一个用于取容器中对象的工厂
        BeanFactory annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AopComponentScanConf.class);
        IUserDao userDao = (IUserDao) annotationConfigApplicationContext.getBean("myFactoryBean");
        IUserDao userDao2 = (IUserDao) annotationConfigApplicationContext.getBean("myFactoryBean");
        FactoryBean myFactoryBean = (FactoryBean) annotationConfigApplicationContext.getBean("&myFactoryBean");
        //myFactoryBean.getObject()和正常方法调用一样
        System.out.println(userDao.equals(myFactoryBean.getObject()));
        System.out.println(userDao.equals(userDao2));*/

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(UserDaoImpl.class);
        annotationConfigApplicationContext.refresh();
        IUserDao userDao = (IUserDao) annotationConfigApplicationContext.getBean("userDao");
        System.out.println(userDao);
    }
}
