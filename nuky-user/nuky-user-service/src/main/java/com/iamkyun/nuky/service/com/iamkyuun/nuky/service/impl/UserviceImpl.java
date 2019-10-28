package com.iamkyun.nuky.service.com.iamkyuun.nuky.service.impl;

import com.iamkyun.nuky.dao.UserDao;
import com.iamkyun.nuky.data.entity.User;
import com.iamkyun.nuky.service.UserService;

import org.springframework.stereotype.Service;

/**
 * @author kyun
 *
 */
@Service
public class UserviceImpl implements UserService {
    private final UserDao userDao;

    public UserviceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getUserById(Long id) {
        return userDao.findById(id).orElse(null);
    }
}
