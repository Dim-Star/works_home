package com.example.main.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Administrator on 2018/12/6.
 */
//用户类

    @Entity
    @Table
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
@Column
        private String username;
@Column
        private String password;
@Column
        private String wx_number;
@Column
        private String phone_number;
@Column
        private String email;
@Column
        private String city;
@Column
        private String sex;
@Column
        private int age;
@OneToMany
@JoinColumn(name = "phone_number")
        private List<Resume> resumes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWx_number() {
        return wx_number;
    }

    public void setWx_number(String wx_number) {
        this.wx_number = wx_number;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Resume> getResumes() {
        return resumes;
    }

    public void setResumes(List<Resume> resumes) {
        this.resumes = resumes;
    }
}
