package com.yang.aop.Service;

import com.yang.aop.entry.User;

import java.util.List;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2019/12/20 11:01
 */
public interface UserService {
    public List<User> getAllUser();

    public User getUser(Integer userId);
}
