package com.yuanwhy.fantasy.dao;

import com.yuanwhy.fantasy.entity.Film;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FilmDao {

	Film getFilm(int n);

	List<Film> getFilms(@Param("start")int start, @Param("offset")int offset);

	int count();
}
