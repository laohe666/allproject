package com.laohe;

import static org.junit.Assert.assertTrue;

import com.laohe.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

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
//        Map<String,String> map = new HashMap<>();
//        map.put("张三","1");
//        map.put("李四","2");
//        map.put("王五","3");
//
//        Set<String> set = map.keySet();
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            System.out.println(next + "---" + map.get(next));
//        }
//
//        Map<String,String> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("张三","1");
//        linkedMap.put("李四","2");
//        linkedMap.put("1","3");
//        linkedMap.get("张三");
//        Set<String> set1 = linkedMap.keySet();
//        Iterator<String> iterator1 = set1.iterator();
//        while (iterator1.hasNext()) {
//            String next = iterator1.next();
//            System.out.println(next + "---" + linkedMap.get(next));
//        }
        LettuceConnectionFactory factory = null;
        System.out.println();
    }

}
