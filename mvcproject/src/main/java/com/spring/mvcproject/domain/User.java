package com.spring.mvcproject.domain;

public class User {
    //private int id;
    private String name;
    private String password;
    private String email;
    //private int age;

    public static final String EMAIL = "mo@naver.com";
    public static final String PASSWORD = "1234";
    public static final String NAME = "살라";

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }


//    @Override
//    public String toString() {
//        return "User{" +
//                "password='" + password + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
}
