package com.itcast.service.impl;

import com.itcast.dao.UserDao;
import com.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//<bean id="userService" class="com.itcast.service.impl.UserServiceImpl">
//@Component("userService")
@Service("userService")  //使用在service层类上用于实例化Bean
@Scope("singleton")    //标注Bean的作用范围
//@Scope("prototype")
public class UserServiceImpl implements UserService {

//    <property name="userDao" ref="userDao"/>
    @Autowired  //按照数据类型从容器中进行匹配
    @Qualifier("userDao")   //是按照id值从容器从进行匹配  此处要结合@Autowired+@Qualifier一起使用
//    @Resource(name="userDao")  //相当于@Autowired+@Qualifier，按照名称进行注入
    private UserDao userDao;

    @Value("${jdbc.driver}") //注入普通属性
    private String driver;
//    有参构造方法
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

//setter方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println(driver);
        userDao.save();
    }
   /* @PostConstruct
    public void init(){
        System.out.println("Service对象的初始化方法");
    }
    @PreDestory
    public void destory(){
        System.out.println("Service对象的销毁方法");
    }*/
}
