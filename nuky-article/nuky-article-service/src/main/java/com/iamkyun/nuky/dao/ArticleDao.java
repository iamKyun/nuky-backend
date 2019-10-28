package com.iamkyun.nuky.dao;

import java.util.List;

import com.iamkyun.nuky.data.entity.Article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kyun
 *
 */
@Repository
public interface ArticleDao extends JpaRepository<Article, Long> {
    /**
     *  return top 5 records
     *
     * @param sort sort
     * @return
     */
    List<Article> findTop5ByPostDateNotNullOrderByPostDateDesc();
}