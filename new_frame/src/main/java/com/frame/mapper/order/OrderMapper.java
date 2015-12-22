package com.frame.mapper.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;

import com.frame.dao.DaoSupport;
import com.frame.service.base.BusinessException;
import com.frame.service.base.CommonEnum;

@Component
public class OrderMapper extends DaoSupport{
	public List<HashMap<Object,Object>> getOrderInfo(){
		List<HashMap<Object,Object>> orderInfoList =  new ArrayList<HashMap<Object, Object>>();
		try
		{
			orderInfoList = this.getListBySQL("getOrderInfo", null);
		}catch(Exception e)
		{
			throw new BusinessException(CommonEnum.BusinessException.ERROR_SYSTEM);
		}
		return orderInfoList; 
	}
}
