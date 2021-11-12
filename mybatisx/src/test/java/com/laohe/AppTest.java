package com.laohe;

import static org.junit.Assert.assertTrue;

import com.laohe.entity.User;
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
}
