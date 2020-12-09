package com.itcast;

import com.itcast.cofig.SpringCofiguration;
import com.itcast.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class UserController {
    public static void main(String[] args) throws SQLException {
//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringCofiguration.class);
        UserService userService = app.getBean(UserService.class);
        userService.save();
        DataSource datasource = app.getBean(DataSource.class);
        Connection connection = datasource.getConnection();
        System.out.println(connection);
    }
}
