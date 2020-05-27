package com.yang.conf;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/25 11:05
 */
public class TestBeanPostProcessor implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //获取到testServiceBeanDefinition
        GenericBeanDefinition testServiceBeanDefinition = (GenericBeanDefinition) registry.getBeanDefinition("testService");
        //设置他的自动注入类型为by_type
        testServiceBeanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
        //registry.registerBeanDefinition("testService", testServiceBeanDefinition);
    }
}
