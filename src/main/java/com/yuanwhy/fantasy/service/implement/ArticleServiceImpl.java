package com.yuanwhy.fantasy.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuanwhy.fantasy.dao.ArticleDao;
import com.yuanwhy.fantasy.domain.Article;
import com.yuanwhy.fantasy.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;

	@Override
	public List<Article> getArticles(int n) {
		return articleDao.getArticles(n);
	}

}
