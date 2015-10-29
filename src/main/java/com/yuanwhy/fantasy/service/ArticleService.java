package com.yuanwhy.fantasy.service;

import java.util.List;

import com.yuanwhy.fantasy.domain.Article;

public interface ArticleService {

    Article getArticle(int n);

    List<Article> getArticles(int n);

}
