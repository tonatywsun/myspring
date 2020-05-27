package com.yang.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/25 11:29
 */
//测试一个BeanPostProcessor
@Configuration
@Import(TestBeanPostProcessor.class)
public class Config {
}
