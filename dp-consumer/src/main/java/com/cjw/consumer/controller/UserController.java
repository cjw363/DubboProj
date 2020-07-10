package com.cjw.consumer.controller;

import com.cjw.api.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

/**
 * @Classname UserController
 * @Description
 * @Date 2020/7/10 15:33
 * @Created by cjw
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    private HttpServletRequest request;

    @RequestMapping(value = "user/{name}")
    @ResponseBody
    public String user(@PathVariable("name") String name,@RequestParam(value = "address",required = false) String address) {
        try {
            name=new String(name.trim().getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(name);
        System.out.println(address);
        return userService.sayHello(name);
    }
}
