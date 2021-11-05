package com.laohe.dal.mapper;

import com.laohe.dal.entity.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface UserMapper {

    /**
     * 查询所有用户
     * @param
     * */
    List<User> selectAllUser();

}
