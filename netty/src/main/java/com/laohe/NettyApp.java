package com.laohe;

/**
 * @Author: 孙靖淳
 * @Date: 2021/12/8 16:40
 */

public class NettyApp {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static void main(String[] args) {
     User.getUser();
        User.getUser();
        User.getUser();
        User user = new User();

        user.get();
        System.out.println(User.a);
        user.get();

        System.out.println(User.a);
    }
}
class User {
    public static final String a = "张三";

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    {
        System.out.println(2);
    }

    static {
        System.out.println("静态块");

    }

    public static void getUser() {
        System.out.println("我是张三");
    }

    public void get() {
        System.out.println("5252");
    }
}
