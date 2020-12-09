package com.itcast.service.impl;

import com.itcast.dao.UserDao;
import com.itcast.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserServiceImpl implements UserService {
//    依赖注入方法  坐等框架把持久层对象传入业务层，而不用我们自己去获取
/*    1.setter方法
        1.1在UserServiceImpl中添加setUserDao方法
        1.2配置Spring容器调用set方法进行注入*/
   /*   2.构造方法
        1.1创造有参构造方法
        1.2配置Spring容器调用有参构造时进行注入
   */
    private UserDao userDao;
   /* public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    @Override
    public void save() {
       /* ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");*/
//        调用dao中的save方法
        userDao.save();
    }
}
