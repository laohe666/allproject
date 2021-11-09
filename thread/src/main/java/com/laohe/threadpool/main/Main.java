package com.laohe.threadpool.main;


import com.laohe.threadpool.util.FileUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/8 15:01
 */
public class Main {
    public static void main(String[] args) {
//        FileUtils.readFile("C:\\Windows");
        List<String> list = new ArrayList<>();
        list.add("李四");
        list.add("张三");
        list.add("王五");
        List<String> ll = list.stream().filter(l -> !l.equals("张三")).collect(Collectors.toList());
        ll.forEach(l -> {
            System.out.println(l);
        });
    }
}
