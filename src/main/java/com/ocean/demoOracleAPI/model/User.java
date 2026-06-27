package com.ocean.demoOracleAPI.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TBLUSER")
public class User {

    @Id
    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "USER_NAME", length = 100, nullable = false)
    private String userName;

    @Column(name = "USER_PASSWORD", length = 255, nullable = false)
    private String userPassword;

    public User() {
    }

    public User(Integer userId, String userName, String userPassword) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
