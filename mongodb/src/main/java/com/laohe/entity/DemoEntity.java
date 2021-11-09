package com.laohe.entity;

import com.alibaba.fastjson.JSON;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/9 14:03
 */

public class DemoEntity implements Serializable {

    private static final long serialVersionUID = 3308955312424182933L;

    @Id
    private Long id;

    private String title;

    private String description;

    private String by;

    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
