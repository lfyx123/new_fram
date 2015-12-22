package com.frame.dao;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lyl
 * @date 2015年12月19日
 * @version 1.0.0
 * 数据库访问层
 */
public class DaoSupport extends SqlSessionDaoSupport {
	@Resource
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	/* 得到类的命名空间 */
	private String getNameSpace() {
		return this.getClass().getName().toString();
	}

	/* 查询LIST */
	public List<HashMap<Object, Object>> getListBySQL(String executeId, HashMap<Object, Object> params) {
		return this.getSqlSession().selectList(getNameSpace()+"."+executeId, params);
	}

	/* 查询单条数据 */
	public HashMap<Object, Object> findOne(String executeId, HashMap<Object, Object> params) {
		return this.findOne(getNameSpace()+"."+executeId, params);
	}

	/* 插入数据 */
	public int insert(String executeId, HashMap<Object, Object> params) {
		return this.getSqlSession().insert(getNameSpace()+"."+executeId, params);
	}

	/* 更新数据 */
	public int update(String executeId, HashMap<Object, Object> params) {
		return this.getSqlSession().update(getNameSpace()+"."+executeId, params);
	}

	/* 删除数据 */
	public int delete(String executeId, HashMap<Object, Object> params) {
		return this.getSqlSession().delete(getNameSpace()+"."+executeId, params);
	}
}
