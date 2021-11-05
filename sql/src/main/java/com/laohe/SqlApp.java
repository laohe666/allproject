package com.laohe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.ManagedBean;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.laohe.dal.mapper")
public class SqlApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(SqlApp.class, args);
    }
}
