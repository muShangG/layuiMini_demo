package com.example.mybatis_demo.entity;

import java.io.Serializable;

/**
 * (Employee)实体类
 *
 * @author makejava
 * @since 2020-02-13 17:03:49
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = -54539381093235374L;
    
    private Integer id;
    
    private String lastname;
    
    private String email;
    
    private Integer gender;
    
    private Integer dId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getDId() {
        return dId;
    }

    public void setDId(Integer dId) {
        this.dId = dId;
    }

}