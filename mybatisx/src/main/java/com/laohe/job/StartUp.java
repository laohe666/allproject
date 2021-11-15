package com.laohe.job;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/15 13:21
 * @des: SpringBoot加载完后 然后马上执行
 */
@Component
public class StartUp implements CommandLineRunner {
    /**
     * SpringBoot加载完成后执行
     * */
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner执行");
    }
}
