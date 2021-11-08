package com.laohe.threadpool.util;

import java.io.File;
import java.util.logging.Logger;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/8 14:43
 */
public class FileUtils {

    /**
     * 读取文件
     * @param filePath 文件路径
     * @return boolean true/false
     * */
    public static boolean readFile(String filePath) {
        File file = new File(filePath);
        //1.判断当前文件是否存在
        if (!file.exists()) {
            return false;
        }
        //2.再判定是不是文件夹
        if (file.isDirectory()) {
            //获取文件夹下的文件
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isDirectory()) {
                        System.out.println("文件夹----》" + f.getName());
                        readFile(f.getAbsolutePath());
                    } else {
                        System.out.println("文件----》" + f.getName());
                    }
                }
            }
        }
        System.out.println("文件----》" + file.getName());

        return true;
    }
}
