package com.yuanwhy.fantasy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yuanwhy.fantasy.domain.Article;
import com.yuanwhy.fantasy.service.ArticleService;

@Controller
public class HomeController {
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Article> articles = new ArrayList<Article>();
		articles.add(articleService.getArticle(2));
		model.addAttribute("articles", articles);
		return "home-index";
	}
}
