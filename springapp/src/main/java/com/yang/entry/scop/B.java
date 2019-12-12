package com.yang.entry.scop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Description: Scope singleton与prototype组合
 * @Author: tona.sun
 * @Date: 2019/12/11 16:03
 */
////默认是singleton单例模式,每次取到的B都是同一个对象
@Scope("singleton")
@Component
public class B {
    //a是原型,每次取到的A都不是同一个对象
    //如果组合到一起，因为B只会被实例化一次，所以A也只会被set一次无法实现每次取到的A都不是同一个对象
    @Autowired
    private A a;

    @Override
    public String toString() {
        return this.hashCode() + "----" + a.hashCode();
    }
   /*使用此方法调用getA能实现每次取到的A都不是同一个对象
   @Lookup
    public abstract A getA();*/

    /*@Override
    public String toString() {
        return this.hashCode() + "----" + getA().hashCode();
    }*/
}
