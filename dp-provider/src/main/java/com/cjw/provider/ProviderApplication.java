package com.cjw.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderApplication {
    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-provider.xml"});
        context.start();
        System.out.println("Provider started.");
        System.in.read(); // 按任意键退出
    }
}