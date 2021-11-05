package com.laohe;

import static org.junit.Assert.assertTrue;

import com.laohe.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AppTest 
{
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


    @Test
    public void set(){
        User user = new User();
        user.setUsername("张三1");
        user.setPassword("李四1");
        redisTemplate.opsForValue().set("myKey",user);
        User user1 = (User) redisTemplate.opsForValue().get("myKey");
    System.out.println(redisTemplate.opsForValue().get("myKey"));
        System.out.println(user1);
    }

}
