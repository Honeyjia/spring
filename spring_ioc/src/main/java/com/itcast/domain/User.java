package com.itcast.domain;

public class User {
    String username;
    String addr;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
