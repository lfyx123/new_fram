package com.frame.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;

import com.frame.dao.daoSupport;

@Component
public class testMapper extends daoSupport{
	public List<HashMap<Object,Object>> getHyInfoA(){
		List<HashMap<Object,Object>> hyInfoList =  new ArrayList<HashMap<Object, Object>>();
		hyInfoList = this.getListBySQL("getHyInfoA", null);
		return hyInfoList; 
	}
	
	public int insertTest()
	{
		return this.insert("insertTest", null);
	}
}
