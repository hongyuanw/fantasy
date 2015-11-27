package com.yuanwhy.fantasy.dao;

import com.yuanwhy.fantasy.AbstractTest;
import com.yuanwhy.fantasy.entity.Film;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yuanwhy on 2015/11/13.
 */
public class FilmDaoTest extends AbstractTest{

    @Autowired
    FilmDao filmDao;

    @Test
    @Transactional
    public void updateTest(){
        Film film = filmDao.findById(2);
        String title = film.getTitle();
        film.setTitle(title + "Test");
        filmDao.update(film);
        Film newfilm = filmDao.findById(2);
        Assert.assertEquals(title + "Test", newfilm.getTitle());
    }

    @Test
    public void insertTest() {
        Film film = new Film();
        film.setTitle("test");
        film.setDescription("this is a test");
        film.setLanguageId((short)1);
        filmDao.insert(film);
        System.out.println(film.getId());
    }
}
