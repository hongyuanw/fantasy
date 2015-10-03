package com.yuanwhy.fantasy.dao.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.yuanwhy.fantasy.dao.ArticleDao;
import com.yuanwhy.fantasy.domain.Article;

@Repository
public class ArticleDaoImpl implements ArticleDao{

	@Override
	public List<Article> getArticles(int n) {
		List<Article> list = new ArrayList<Article>();
		list.add(new Article(1, "how to learn Java", "We can learn Java by google.com"));
		list.add(new Article(2, "how to learn C++", "We can learn C++ by google.com"));
		return list;
	}

}
