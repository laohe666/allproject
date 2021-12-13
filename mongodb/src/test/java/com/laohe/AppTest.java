package com.laohe;

import static org.junit.Assert.assertTrue;

import com.laohe.entity.DemoEntity;
import com.laohe.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AppTest 
{
    @Autowired
    DemoService demoService;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        DemoEntity entity = new DemoEntity();
        entity.setId(4L);
//        entity.setTitle("标题");
        entity.setBy("张三");
        entity.setDescription("张三的描述");
        entity.setUrl("www.baidu.com");
        demoService.saveDemo(entity);
        System.out.println(demoService.findDemoById(2L));
    }

    @Test
    public void getEntity() {
        demoService.findDemoById(2L);
    }
}
