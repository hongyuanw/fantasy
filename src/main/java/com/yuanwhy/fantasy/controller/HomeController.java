package com.yuanwhy.fantasy.controller;

import com.yuanwhy.fantasy.domain.Film;
import com.yuanwhy.fantasy.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    public static final String FILMS = "films";

    @Autowired
    private FilmService filmService;

    @RequestMapping("/")
    public ModelAndView index() {
        List<Film> films =filmService.getFilms(2);
        ModelAndView modelAndView = new ModelAndView("home/index");
        modelAndView.addObject(FILMS, films);
        return modelAndView;
    }
}
