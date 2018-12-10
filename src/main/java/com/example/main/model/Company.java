package com.example.main.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Administrator on 2018/12/6.
 */
//公司表
    @Entity
    @Table
public class Company {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
        private int c_id;
@Column
        private String c_name;
@Column
        private String c_username;
@Column
        private String c_password;
//公司福利
    @Column
        private String c_welfare;
        //公司所在行业
    @Column
        private String c_industry;
        //企业性质
    @Column
    private String c_nature;
    //企业规模
    @Column
    private String c_scale;
    //公司介绍
    @Column
    private String c_des;
    //职位表
    @OneToMany
    @JoinColumn(name = "c_id")
    private List<Position> positions;
@Column
    private String c_phone_number;
@Column
    private String c_addr;

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_username() {
        return c_username;
    }

    public void setC_username(String c_username) {
        this.c_username = c_username;
    }

    public String getC_password() {
        return c_password;
    }

    public void setC_password(String c_password) {
        this.c_password = c_password;
    }

    public String getC_welfare() {
        return c_welfare;
    }

    public void setC_welfare(String c_welfare) {
        this.c_welfare = c_welfare;
    }

    public String getC_industry() {
        return c_industry;
    }

    public void setC_industry(String c_industry) {
        this.c_industry = c_industry;
    }

    public String getC_nature() {
        return c_nature;
    }

    public void setC_nature(String c_nature) {
        this.c_nature = c_nature;
    }

    public String getC_scale() {
        return c_scale;
    }

    public void setC_scale(String c_scale) {
        this.c_scale = c_scale;
    }

    public String getC_des() {
        return c_des;
    }

    public void setC_des(String c_des) {
        this.c_des = c_des;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public String getC_phone_number() {
        return c_phone_number;
    }

    public void setC_phone_number(String c_phone_number) {
        this.c_phone_number = c_phone_number;
    }

    public String getC_addr() {
        return c_addr;
    }

    public void setC_addr(String c_addr) {
        this.c_addr = c_addr;
    }
}
