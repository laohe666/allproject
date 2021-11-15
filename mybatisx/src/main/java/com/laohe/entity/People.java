package com.laohe.entity;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/15 10:07
 */

public class People implements Serializable {
    private static final long serialVersionUID = -615847571152085969L;

    /**
     * id
     * */
    @TableId(type = IdType.ID_WORKER_STR ,value = "id")
    private String id;

    /**
     * 用户名
     * */
    private String username;

    /**
     * 密码
     * */
    private String password;


    public String getId() {
        return id;
    }

    public void setId(String id) {
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
