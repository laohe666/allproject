package com.laohe.threadpool;

import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.*;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/22 14:16
 */
public class Main implements Callable {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newCachedThreadPool();
//        Thread thread = new Thread(() -> {
//            System.out.println(Thread.currentThread().getThreadGroup());
//        });
//        thread.start();
        System.out.println(Thread.currentThread().getThreadGroup());
        System.out.println(Thread.currentThread().getStackTrace().length);
        System.out.println(Thread.currentThread().getThreadGroup().getParent());
    }

    @Override
    public Object call() throws Exception {
        return null;
    }
}
