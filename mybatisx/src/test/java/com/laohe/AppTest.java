package com.laohe;

import static org.junit.Assert.assertTrue;

import com.baomidou.mybatisplus.annotation.TableId;
import com.laohe.entity.People;
import com.laohe.entity.User;
import com.laohe.mapper.PeopleMapper;
import com.laohe.mapper.UserMapper;
import com.laohe.service.impl.PeopleServiceImpl;
import com.laohe.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Unit test for simple App.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AppTest 
{

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private PeopleServiceImpl peopleService;

    @Autowired
    private PeopleMapper peopleMapper;

    /**
     * 测试新增用户
     * */
    @Test
    public void addUser() {
        User user = new User();
        user.setUsername("张三1000");
        user.setPassword("密码");
        userService.addUser(user);
    }

    /**
     * 测试查询用户
     * */
    @Test
    public void findUsers() {
        List<User> users = userService.findUsers();
        users.stream().forEach(user -> System.out.println(user));
    }


    /**
     * 测试新增 People
     * */
    @Test
    public void addPeople() {
        People people = new People();
        people.setUsername("张三8");
        people.setPassword("123456");

        peopleMapper.insert(people);
    }
}
