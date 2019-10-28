package com.iamkyun.nuky.data.dao;

import com.iamkyun.nuky.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kyun
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {
}
