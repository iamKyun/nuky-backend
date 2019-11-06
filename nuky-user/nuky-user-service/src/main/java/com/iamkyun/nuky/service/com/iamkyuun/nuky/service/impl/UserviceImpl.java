package com.iamkyun.nuky.service.com.iamkyuun.nuky.service.impl;

import com.iamkyun.nuky.dao.UserRepository;
import com.iamkyun.nuky.data.entity.User;
import com.iamkyun.nuky.service.UserService;

import org.springframework.stereotype.Service;

/**
 * @author kyun
 *
 */
@Service
public class UserviceImpl implements UserService {
    private final UserRepository userRepository;

    public UserviceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
