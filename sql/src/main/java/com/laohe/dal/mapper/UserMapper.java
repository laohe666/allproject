package com.laohe.dal.mapper;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface UserMapper {
    List<HashMap<String,String>> selectAllUser();

}
