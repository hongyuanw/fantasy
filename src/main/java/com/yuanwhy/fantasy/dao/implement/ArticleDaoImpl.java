package com.yuanwhy.fantasy.dao.implement;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yuanwhy.fantasy.dao.ArticleDao;
import com.yuanwhy.fantasy.domain.Article;

@Repository
public class ArticleDaoImpl implements ArticleDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Article> getArticles(int n) {
		List<Article> list = sqlSession.selectList("selectArticles", n);
		return list;
	}

}
