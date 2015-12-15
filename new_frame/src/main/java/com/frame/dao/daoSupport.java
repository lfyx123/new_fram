package com.frame.dao;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ���ݿ�ʵ����
 * 
 */
public class daoSupport extends SqlSessionDaoSupport {
	@Resource
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	/* �õ���������ռ� */
	private String getNameSpace() {
		return this.getClass().getName().toString();
	}

	/* ��ѯLIST */
	public List<HashMap<Object, Object>> getListBySQL(String executeId, HashMap<Object, Object> params) {
		return this.getSqlSession().selectList(getNameSpace()+"."+executeId, params);
	}

	/**/

	/* ��ѯ�������� */
	public HashMap<Object, Object> findOne(String executeId, HashMap<Object, Object> params) {
		return this.findOne(getNameSpace()+"."+executeId, params);
	}

	/* �������� */
	public int insert(String executeId, HashMap<Object, Object> params) {
		return this.insert(getNameSpace()+"."+executeId, params);
	}

	/* �������� */
	public int update(String executeId, HashMap<Object, Object> params) {
		return this.update(getNameSpace()+"."+executeId, params);
	}

	/* ɾ������ */
	public int delete(String executeId, HashMap<Object, Object> params) {
		return this.delete(getNameSpace()+"."+executeId, params);
	}
}
