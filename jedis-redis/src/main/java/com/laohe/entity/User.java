package com.laohe.entity;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/5 11:27
 */
@Data
public class User {

    private static final long serialVersionUID = -8739812849958893216L;

    /**
     * 用户名
     * */
    private String username;

    /**
     * 密码
     * */
    private String password;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
