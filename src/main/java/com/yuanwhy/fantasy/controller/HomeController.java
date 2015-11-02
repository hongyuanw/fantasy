package com.yuanwhy.fantasy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yuanwhy.fantasy.domain.Article;
import com.yuanwhy.fantasy.service.ArticleService;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    public static final String ARTICLES = "articles";

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/")
    public ModelAndView index() {
        List<Article> articles =articleService.getArticles(2);
        ModelAndView modelAndView = new ModelAndView("home/index");
        modelAndView.addObject(ARTICLES, articles);
        return modelAndView;
    }
}
