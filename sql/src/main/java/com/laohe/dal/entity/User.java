package com.laohe.dal.entity;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/5 15:53
 */
@Data
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 302577880090783088L;

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
