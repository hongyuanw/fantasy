package com.yuanwhy.fantasy.service.implement;

import com.yuanwhy.fantasy.dao.FilmDao;
import com.yuanwhy.fantasy.dto.PageDto;
import com.yuanwhy.fantasy.entity.Film;
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
    public PageDto<Film> getFilms(int pageSize, int pageNum) {
        List<Film> films = filmDao.getFilms(pageSize * (pageNum - 1), pageSize);
        PageDto<Film> pageDto = new PageDto<Film>();
        pageDto.setItems(films);
        pageDto.setPageNum(pageNum);
        pageDto.setPageCount((int)Math.ceil(filmDao.count() * 1.0 / pageSize));
        return pageDto;
    }
}
