package com.itcast.demo;

import com.itcast.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserControl {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService) app.getBean("service");
//        调用service中的save方法
        service.save();
    }
}
