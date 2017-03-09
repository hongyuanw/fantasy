package com.yuanwhy.fantasy.dao;


/**
 * Created by yuanwhy on 2015/11/13.
 */
public interface BaseDao<T> {

    void insert(T entity);

    void update(T entity);

    T findById(Integer id);

    void delete(Integer id);
}
