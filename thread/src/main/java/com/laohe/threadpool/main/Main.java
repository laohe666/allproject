package com.laohe.threadpool.main;


import com.laohe.threadpool.util.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/8 15:01
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\13813\\Desktop\\MMMxxx.txt");
        file.setLastModified(System.currentTimeMillis());

    }
}
