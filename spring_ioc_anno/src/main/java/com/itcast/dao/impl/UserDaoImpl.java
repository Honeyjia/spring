package com.itcast.dao.impl;

import com.itcast.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//<bean id="userDao" class="com.itcast.dao.impl.UserDaoImpl"></bean>
//@Component("userDao")  //使用在类上用于实例化Bean
@Repository("userDao")   //使用在dao层类上用于实例化Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save is running");
    }
}
