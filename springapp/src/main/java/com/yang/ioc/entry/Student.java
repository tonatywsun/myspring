package com.yang.ioc.entry;

import lombok.Data;
import lombok.ToString;

/**
 * @Description: 一个测试实体类
 * @Author: tona.sun
 * @Date: 2019/12/10 14:41
 */
//@Component("student")
@Data
@ToString
//@Profile("dev") 指定环境可以访问到
public class Student {
    public Student() {
    }

    public Student(Integer age) {
        this.age = age;
    }

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
