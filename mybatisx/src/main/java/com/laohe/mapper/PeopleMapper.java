package com.laohe.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.laohe.entity.People;
import com.laohe.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/15 10:10
 */
@Repository
public interface PeopleMapper extends BaseMapper<People> {

    /**
     * 新增People
     * */
    int addPeople(People people);

}
