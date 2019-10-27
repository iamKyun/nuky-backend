package com.iamkyun.nuky.article.data.dao;

import java.util.List;

import com.iamkyun.nuky.article.data.entity.Article;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kyun
 *
 */

public interface ArticleDao extends JpaRepository<Article, Long> {
    /**
     *  return top 5 records
     *
     * @param sort sort
     * @return
     */
    List<Article> findFirst5(Sort sort);
}
