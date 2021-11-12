package com.laohe.service;

import com.laohe.entity.User;

import java.util.List;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/12 15:31
 */
public interface UserService {

    void addUser(User user);

    List<User> findUsers();
}
