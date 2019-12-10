package com.yang.entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description: 通过xml中自动装配装配一个student
 * @Author: tona.sun
 * @Date: 2019/12/10 17:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Teacher {
    Student student;

}
