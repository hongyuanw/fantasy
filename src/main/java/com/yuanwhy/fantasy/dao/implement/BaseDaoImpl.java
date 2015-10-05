package com.yuanwhy.fantasy.dao.implement;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDaoImpl<T> {
	@Autowired
	private SqlSession sqlSession;
	
	protected SqlSession getSqlSession() {
		return sqlSession;
	}
}
