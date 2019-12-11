package com.yang.entry.scop;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Description: 就是没有意义的实体类A
 * @Author: tona.sun
 * @Date: 2019/12/11 16:00
 */
//prototype原型模式,每次取到的A都不是同一个对象
@Component
@Scope("prototype")
public class A {
}
