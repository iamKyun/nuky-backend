package com.iamkyun.nuky.repository;

import com.iamkyun.nuky.model.entity.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kyun
 *
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
