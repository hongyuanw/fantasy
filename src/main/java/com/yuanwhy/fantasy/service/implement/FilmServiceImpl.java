package com.yuanwhy.fantasy.service.implement;

import com.yuanwhy.fantasy.dao.FilmDao;
import com.yuanwhy.fantasy.domain.Film;
import com.yuanwhy.fantasy.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmDao filmDao;

    @Override
    public Film getFilm(int n) {
        return filmDao.getFilm(n);
    }

    @Override
    public List<Film> getFilms(int n) {
        return filmDao.getFilms(n);
    }

}
