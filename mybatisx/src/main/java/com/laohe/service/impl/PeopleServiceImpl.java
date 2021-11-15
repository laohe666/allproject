package com.laohe.service.impl;

import com.laohe.entity.People;
import com.laohe.mapper.PeopleMapper;
import com.laohe.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/15 10:14
 */
@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleMapper peopleMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addPeople(People people) {
        peopleMapper.addPeople(people);
        return 0;
    }
}
