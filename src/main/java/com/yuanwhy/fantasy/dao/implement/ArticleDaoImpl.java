package com.yuanwhy.fantasy.dao.implement;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.yuanwhy.fantasy.dao.ArticleDao;
import com.yuanwhy.fantasy.domain.Article;

@Repository
public class ArticleDaoImpl extends BaseDaoImpl<Article> implements ArticleDao {

	@Override
	public List<Article> getArticles(int n) {
		List<Article> list = getSqlSession().selectList("selectArticles", n);
		return list;
	}

}
