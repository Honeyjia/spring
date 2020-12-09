package com.itcast.test;
/*
1.导入spring集成Junit的坐标
2.使用@Runwith注解替换原来的运行期
3.使用@ContextConfiguration指定配置文件或配置类
4.使用@Autowired注入需要测试的对象
5.创建测试方法进行测试
*/

import com.itcast.cofig.SpringCofiguration;
import com.itcast.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml") //xml配置
@ContextConfiguration(classes = {SpringCofiguration.class}) //全注解方式  数组

public class SpringJunitTest {
    @Autowired
    private UserService userService;
    @Autowired
    private DataSource dataSource;
    @Test
    public void test1() throws SQLException {
        userService.save();
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
