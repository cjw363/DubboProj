package com.cjw.demo.impl;

import com.cjw.demo.UserService;

/**
 * @Classname UserServiceImpl
 * @Description
 * @Date 2020/7/8 23:10
 * @Created by cjw
 */
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
