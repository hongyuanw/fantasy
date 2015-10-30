package com.yuanwhy.fantasy.service.implement;

import com.yuanwhy.fantasy.dao.ArticleDao;
import com.yuanwhy.fantasy.domain.Article;
import com.yuanwhy.fantasy.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public Article getArticle(int n) {
        return articleDao.getArticle(n);
    }

    @Override
    public List<Article> getArticles(int n) {
        return articleDao.getArticles(n);
    }

}
