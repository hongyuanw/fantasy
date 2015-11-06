package com.yuanwhy.fantasy.service;

import com.yuanwhy.fantasy.dto.PageDto;
import com.yuanwhy.fantasy.entity.Film;

public interface FilmService {

    Film getFilm(int n);

    PageDto<Film> getFilms(int pageSize, int pageNum);

}
