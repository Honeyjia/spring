package com.itcast.demo;

import com.itcast.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoDemo {
    public static void main(String[] args) {
/*
        2.1 Spring程序开发步骤
        1.导入 Spring 开发的基本包坐标
        2.编写 Dao 接口和实现类
        3.创建 Spring 核心配置文件
        4.在 Spring 配置文件中配置 UserDaoImpl
        5.使用 Spring 的 API 获得 Bean 实例
*/

//        加载配置文件  创建spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        通过getBean方法传参 参数是id值
//        UserDao userDao1 = (UserDao) app.getBean("userDao");
        UserDao userDao1 = app.getBean(UserDao.class);
        //参数是Class类型，当容器中值勋在一个这样类型的对象，则可以用，如果存在多个，则会会报错，需要使用参数为String类型的(id值)
        userDao1.save();
//        销毁 关闭
//        ((ClassPathXmlApplicationContext)app).close();
//        userDao.save();

    }
}
