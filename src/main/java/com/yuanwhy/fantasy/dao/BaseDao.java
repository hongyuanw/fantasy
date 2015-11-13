package com.yuanwhy.fantasy.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yuanwhy on 2015/11/13.
 */
public interface BaseDao<T> {
    void insert(T entity);

    void update(T entity);

    T findById(Integer id);

    List<T> findByIds(List<Integer> ids);

    List<T> findAll(@Param("start")int start, @Param("offset")int offset);

    void delete(Integer id);

    Integer count();
}
