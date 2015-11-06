package com.yuanwhy.fantasy.controller;

import com.yuanwhy.fantasy.dto.PageDto;
import com.yuanwhy.fantasy.entity.Film;
import com.yuanwhy.fantasy.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ServletForwardingController;

import java.util.List;

@Controller
public class HomeController {

    public static final String FILMS = "films";

    @Autowired
    private FilmService filmService;

    @RequestMapping("/")
    public String index() {
        String forwardUrl = "forward:/film/list/pagesize/10/pagenum/1";
        return forwardUrl;
    }
}
