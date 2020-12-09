package com.itcast.factory;

import com.itcast.dao.UserDao;
import com.itcast.dao.impl.UserDaoImpl;

public class DynamicFactory {
    //非静态方法返回Bean实例化
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
