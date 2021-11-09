package com.laohe.service;

import com.laohe.dao.DemoDao;
import com.laohe.entity.DemoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @Author: 孙靖淳
 * @Date: 2021/11/9 14:14
 */
@Service
public class DemoService implements DemoDao {
    @Autowired
    private MongoTemplate template;


    @Override
    public void saveDemo(DemoEntity entity) {
        template.save(entity);
    }

    @Override
    public void removeDemo(Long id) {
        template.remove(id);
    }

    @Override
    public void updateDemo(DemoEntity entity) {
        Query query = new Query(Criteria.where("id").is(entity.getId()));
        Update update = new Update();
        update.set("title", entity.getTitle());
        template.updateFirst(query, update, DemoEntity.class);
    }

    @Override
    public DemoEntity findDemoById(Long id) {
        Query query = new Query(Criteria.where("id").is(id));
        DemoEntity demoEntity = template.findOne(query, DemoEntity.class);
        return demoEntity;
    }
}
