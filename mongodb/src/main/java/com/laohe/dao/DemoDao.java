package com.laohe.dao;

import com.laohe.entity.DemoEntity;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/9 14:12
 */
public interface DemoDao {
    void saveDemo(DemoEntity entity);

    void removeDemo(Long id);

    void updateDemo(DemoEntity entity);

    DemoEntity findDemoById(Long id);
}
