package com.neu.testspringboot.dto;

import java.io.Serializable;

public class UserLogin implements Serializable {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "username='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
