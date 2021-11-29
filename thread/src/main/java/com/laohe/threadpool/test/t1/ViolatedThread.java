package com.laohe.threadpool.test.t1;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/22 16:19
 */
public class ViolatedThread implements Runnable {


    private int num = 1000;


    @Override
    public void run() {
        while (num != 0) {

            System.out.println(num--);
        }

    }
}
