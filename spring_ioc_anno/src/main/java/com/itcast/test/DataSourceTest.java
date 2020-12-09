package com.itcast.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.itcast.cofig.SpringCofiguration;
import com.itcast.service.UserService;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DataSourceTest {

//    c3p0数据源
    @Test
    public void test1() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
//        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setJdbcUrl("jdbc:mysql:///test");
        dataSource.setUser("root");
        dataSource.setPassword("031362");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

//    druid数据源
    @Test
    public void test2() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///test");
        dataSource.setUsername("root");
        dataSource.setPassword("031362");
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    //手动创建druid数据源
    @Test
    public void test3() throws SQLException {
//      读取jdbc.properties配置文件创建连接池
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");
        String driver = rb.getString("jdbc.driver");
        String url = rb.getString("jdbc.url");
        String username = rb.getString("jdbc.username");
        String password = rb.getString("jdbc.password");
//         创建数据源对象  设置连接参数
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

//    Spring配置数据源
//    测试从容器当中获取数据源
    @Test
    public void test4() throws SQLException {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = app.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

//    注入新注解 测试
    @Test
    public void test5() throws SQLException {
        //全新注解配置文件
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringCofiguration.class);
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }
}
