package com.laohe.mapper;

import com.laohe.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/12 15:18
 */
@Repository
public interface UserMapper {

    /**
     * 插入用户
     * @param user 用户对象
     * */
    int insertUser(User user);

    /**
     * 查询用户
     * */
    List<User> findUsers();
}
