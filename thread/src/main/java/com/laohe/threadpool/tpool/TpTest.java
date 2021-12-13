package com.laohe.threadpool.tpool;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/29 15:36
 */
public class TpTest {

    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(
                10,
                20,
                30L,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue(5),
                new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 10 ; i++) {
            executorService.submit(() -> {
                System.out.println(1);
            });
        }

        int i = Runtime.getRuntime().availableProcessors();
        Runtime.getRuntime().gc();

    }
}
