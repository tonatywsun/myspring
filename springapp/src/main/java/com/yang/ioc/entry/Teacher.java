package com.yang.ioc.entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * @Description: 通过xml中自动装配装配一个student
 * @Author: tona.sun
 * @Date: 2019/12/10 17:11
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component("teacher")
public class Teacher {
    @Resource    //byName-->byType
    //@Autowired //byType
    private Student student;
}
