package com.atguigu.bean;


public class User {

    private String user;
    private Integer age;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", age=..." + age +
                '}';
    }
}
