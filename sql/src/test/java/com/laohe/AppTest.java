package com.laohe;

import static org.junit.Assert.assertTrue;

import com.laohe.dal.entity.User;
import com.laohe.dal.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.List;

/**
 * Unit test for simple App.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AppTest 
{

    @Autowired
    private UserMapper mapper;

    @Resource
    private DataSource dataSource;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println(dataSource.getClass());
    }
}
