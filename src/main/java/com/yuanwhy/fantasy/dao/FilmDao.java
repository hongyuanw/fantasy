package com.yuanwhy.fantasy.dao;

import java.util.List;

import com.yuanwhy.fantasy.domain.Film;

public interface FilmDao {

	Film getFilm(int n);

	List<Film> getFilms(int n);
}
