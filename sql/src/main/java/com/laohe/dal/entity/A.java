package com.laohe.dal.entity;

/**
 * @author Li XunHuan
 * @version 5.0.0
 * created at 2021/11/2 20:55
 * copyright @2021 李寻欢
 */
public class A {
    private String a;

    public void init(String a) {
        a = a;
    }

    public void getA() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        A a = new A();

        a.getA();

        A a1 = new A();
        a1.getA();
    }
}
