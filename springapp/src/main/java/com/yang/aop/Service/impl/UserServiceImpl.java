package com.yang.aop.Service.impl;

import com.google.common.collect.Lists;
import com.yang.aop.Service.UserService;
import com.yang.aop.entry.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2019/12/20 11:04
 */
@Service("userServiceImpl")
@Scope("prototype")
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getAllUser() {
        System.out.println("UserServiceImpl getAllUser");
        return Lists.newArrayList(new User());
    }

    @Override
    public User getUser(Integer userId) {
        return null;
    }
}
