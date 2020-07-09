package com.cjw.consumer;

import com.cjw.api.UserService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerApplication {
    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-consumer.xml"});
        context.start();
        UserService userService = (UserService)context.getBean("userService");
        String hello = userService.sayHello("world");
        System.out.println(hello);
    }
}