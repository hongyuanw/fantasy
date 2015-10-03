package com.yuanwhy.fantasy.service;

import java.util.List;

import com.yuanwhy.fantasy.domain.Article;

public interface ArticleService {

	List<Article> getArticles(int n);
	
}
