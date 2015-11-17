package com.yuanwhy.fantasy.controller;

import com.yuanwhy.fantasy.dto.PageDto;
import com.yuanwhy.fantasy.entity.Film;
import com.yuanwhy.fantasy.service.FilmService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by yuanwhy on 2015/11/6.
 */

@Controller
@RequestMapping(value = "/film")
public class FilmController {
    private static final Logger logger = Logger.getLogger(FilmController.class);

    @Autowired
    FilmService filmService;

    @RequestMapping(value = "/list/pagesize/{pageSize}/pagenum/{pageNum}", method = RequestMethod.GET)
    public ModelAndView show(@PathVariable int pageSize, @PathVariable int pageNum, HttpServletRequest request) {
        PageDto<Film> filmDtos = filmService.getFilms(pageSize, pageNum);
        String urlWithoutPaging = "/film/list/pagesize/" + pageSize;
        ModelAndView modelAndView = new ModelAndView("/film/list");
        modelAndView.addObject("filmDtos", filmDtos);
        modelAndView.addObject("urlWithoutPaging", urlWithoutPaging);

        logger.info("films have been showed");
        return modelAndView;
    }
}
