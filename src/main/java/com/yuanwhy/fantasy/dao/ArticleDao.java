package com.yuanwhy.fantasy.dao;

import java.util.List;

import com.yuanwhy.fantasy.domain.Article;

public interface ArticleDao {

	Article getArticle(int n);

	List<Article> getArticles(int n);
}
