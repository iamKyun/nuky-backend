package com.iamkyun.nuky.repository;

import com.iamkyun.nuky.model.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kyun
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
