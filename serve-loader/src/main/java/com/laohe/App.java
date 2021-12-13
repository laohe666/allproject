package com.laohe;

import com.laohe.dao.UserDao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   UserDao userDao = null;
        List<UserDao> userDaos = new ArrayList<>();
        ServiceLoader<UserDao> load = ServiceLoader.load(UserDao.class);
        Iterator<UserDao> iterator = load.iterator();
        while (iterator.hasNext()) {
            userDaos.add(iterator.next());
        }
        System.out.println(userDaos.size());
        userDao = userDaos.get(0);
        userDao.findUser();
    }
}
