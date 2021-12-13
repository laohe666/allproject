package com.laohe.service;

import com.laohe.dao.UserDao;

/**
 * @Author: 孙靖淳
 * @Date: 2021/12/13 11:53
 */
public class UserService implements UserDao {
    @Override
    public void findUser() {
        System.out.println("我是张三");
    }
}
