package com.laohe.entity;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/12 15:18
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1128011485313153565L;

    /**
     * 主键ID
     * */
    private Integer id;

    /**
     * 用户名
     * */
    private String username;

    /**
     * 密码
     * */
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
