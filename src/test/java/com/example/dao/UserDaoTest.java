package com.example.dao;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Liping on 11/18/15.
 */
public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();

    @Test
    public void testFindUserById() throws Exception {
        Assert.assertEquals(userDao.findUserById("1"), "1");
    }
}