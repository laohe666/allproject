package com.laohe.entity;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 孙靖淳
 * @Date: 2021/12/6 14:38
 */
@Data
public class User implements Serializable {

    /**
     * id
     */
    public String username = "张三";

    /**
     * 密码
     */
    private String password;

    /**
     * 地址
     */
    private String address;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public void startUp(String name) {
        System.out.println("我是: " + name);
    }
}
