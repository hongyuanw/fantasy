package com.yuanwhy.fantasy.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuanwhy.fantasy.dao.ArticleDao;
import com.yuanwhy.fantasy.domain.Article;
import com.yuanwhy.fantasy.service.ArticleService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public List<Article> getArticles(int n) {
        List<Article> list = new ArrayList<Article>();
        for (int i = 0; i < 3; i++) {
            list.add(getArticle(i));
        }
        return list;
    }

    @Override
    @Transactional
    public Article getArticle(int n) {
        return articleDao.getArticle(n);
    }
}
