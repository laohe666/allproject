package com.laohe;

import com.laohe.entity.User;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        User user = new User();
        Class<? extends User> userClass = user.getClass();

        Field[] declaredFields = userClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.getGenericType());
        }
        Field username = userClass.getField("username");
        username.set(user,"123456");
        String username1 = user.getUsername();
        System.out.println(username1);
        System.out.println(user);
//
//        Method[] methods = userClass.getMethods();
//        for (Method method : methods) {
//            System.out.println(method.getName());
//
//        }
//        Method startUp = userClass.getMethod("startUp", String.class);
//        String[] strings = new String[5];
//        startUp.invoke(new User(),"8989");
//        Long a = 18999999999L;
//        System.out.println(a);

    }
}
