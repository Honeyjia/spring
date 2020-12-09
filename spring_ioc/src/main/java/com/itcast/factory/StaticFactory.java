package com.itcast.factory;

import com.itcast.dao.UserDao;
import com.itcast.dao.impl.UserDaoImpl;

public class StaticFactory {
//    工厂静态方法实例化返回Bean实例化
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
