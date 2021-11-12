package com.laohe.service.impl;

import com.laohe.entity.User;
import com.laohe.mapper.UserMapper;
import com.laohe.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @Author: 孙靖淳
 * @Date: 2021/11/12 15:32
 */
@Service
public class UserServiceImpl implements UserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    /**
     * 增加用户
     */
    @Override
//    @Transactional(rollbackFor = Exception.class)
    public void addUser(User user) {

        int i = userMapper.insertUser(user);
        logger.info("{}",1/0);
        logger.info("插入用户信息：{}", i);
    }

    @Override
    public List<User> findUsers() {
        logger.info("{}",1/0);
        return userMapper.findUsers();
    }
}
