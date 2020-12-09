package com.itcast.dao.impl;

import com.itcast.dao.UserDao;
import com.itcast.domain.User;
import org.springframework.core.convert.Property;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {
//    几何数据类型  List<String>
    private List<String> strList;
    private Map<String, User> userMap;
    private Properties proprities;

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProprities(Properties proprities) {
        this.proprities = proprities;
    }

    private String username;
    private int age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    无参构造方法
    /*public UserDaoImpl(){
        System.out.println("方法被创建...");
    }
    public void init(){
        System.out.println("方法被初始化...");
    }
    public void destory(){
        System.out.println("方法被销毁...");
    }*/
    public void save() {
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(proprities);
//        System.out.println(username+"===="+age);
        System.out.println("save is running ...");
    }
}
