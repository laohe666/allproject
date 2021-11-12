package com.laohe.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/12 15:16
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.laohe.mapper")
public class MybatisXConfig {

    /**
     * 注入分页内容
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        //设置单页最大条数,默认配置为500条, -1不限制
        paginationInterceptor.setLimit(2);
        return paginationInterceptor;
    }

}
