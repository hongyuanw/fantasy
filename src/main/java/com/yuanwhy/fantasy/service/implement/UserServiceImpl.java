package com.yuanwhy.fantasy.service.implement;

import com.yuanwhy.fantasy.dao.UserDao;
import com.yuanwhy.fantasy.entity.User;
import com.yuanwhy.fantasy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserById(int id) {
        return userDao.findById(id);
    }
}
