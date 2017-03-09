package com.yuanwhy.fantasy.dao;

import com.yuanwhy.fantasy.AbstractTest;
import com.yuanwhy.fantasy.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yuanwhy on 2015/11/13.
 */
public class UserDaoTest extends AbstractTest{

    @Autowired
    private UserDao userDao;


    @Test
    @Transactional
    public void insertTest() {
        User user  = new User(1, "John", 23);
        userDao.insert(user);

        User foundUser = userDao.findById(1);

        Assert.assertTrue(user.equals(foundUser));
    }
}
