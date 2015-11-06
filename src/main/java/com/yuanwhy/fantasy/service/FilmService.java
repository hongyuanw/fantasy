package com.yuanwhy.fantasy.service;

import java.util.List;

import com.yuanwhy.fantasy.domain.Film;

public interface FilmService {

    Film getFilm(int n);

    List<Film> getFilms(int n);

}
