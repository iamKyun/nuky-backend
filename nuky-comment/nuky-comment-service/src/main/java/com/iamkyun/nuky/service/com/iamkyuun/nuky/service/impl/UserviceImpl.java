package com.iamkyun.nuky.service.com.iamkyuun.nuky.service.impl;

import com.iamkyun.nuky.mapper.UserMapper;
import com.iamkyun.nuky.model.entity.User;
import com.iamkyun.nuky.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author kyun
 */
@Service
public class UserviceImpl implements UserService {
    private final UserMapper userMapper;

    public UserviceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserById(Long id) {
        return Optional.of(userMapper.selectById(id)).orElse(null);
    }
}
