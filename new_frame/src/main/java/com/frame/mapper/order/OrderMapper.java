package com.frame.mapper.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Component;
import com.frame.dao.DaoSupport;
import com.frame.service.base.BusinessException;
import com.frame.service.base.CommonEnum;

@Component
public class OrderMapper extends DaoSupport{
	public List<HashMap<Object,Object>> getKHQSDList(HashMap<Object, Object> param){
		List<HashMap<Object,Object>> KHQSDList =  new ArrayList<HashMap<Object, Object>>();
		try
		{
			KHQSDList = this.getListBySQL("getKHQSDList", param);
		}catch(Exception e)
		{
			throw new BusinessException(CommonEnum.BusinessException.ERROR_SYSTEM);
		}
		return KHQSDList; 
	}
	
	public HashMap<Object,Object> getKHDD(HashMap<Object, Object> param){
		HashMap<Object,Object> KHDD =  new HashMap<Object, Object>();
		try
		{
			KHDD = this.findOne("getKHDDList", param);
		}catch(Exception e)
		{
			throw new BusinessException(CommonEnum.BusinessException.ERROR_SYSTEM);
		}
		return KHDD; 
	}
	
	public HashMap<Object,Object> getKHDDZT(HashMap<Object, Object> param){
		HashMap<Object,Object> KHDDZT =  new HashMap<Object, Object>();
		try
		{
			KHDDZT = this.findOne("getKHDDZT", param);
		}catch(Exception e)
		{
			throw new BusinessException(CommonEnum.BusinessException.ERROR_SYSTEM);
		}
		return KHDDZT; 
	}
	
	public List<HashMap<Object,Object>> getYSDDSJList(HashMap<Object, Object> param){
		List<HashMap<Object,Object>> YSDDSJList =  new ArrayList<HashMap<Object, Object>>();
		try
		{
			YSDDSJList = this.getListBySQL("getYSDDSJList", param);
		}catch(Exception e)
		{
			throw new BusinessException(CommonEnum.BusinessException.ERROR_SYSTEM);
		}
		return YSDDSJList; 
	}
	
	public HashMap<Object,Object> getYDZT(HashMap<Object, Object> param){
		HashMap<Object,Object> YDZT =  new HashMap<Object, Object>();
		try
		{
			YDZT = this.findOne("getYDZT", param);
		}catch(Exception e)
		{
			throw new BusinessException(CommonEnum.BusinessException.ERROR_SYSTEM);
		}
		return YDZT; 
	}
	
	public List<HashMap<Object,Object>> getDDGZList(HashMap<Object, Object> param){
		List<HashMap<Object,Object>> DDGZList =  new ArrayList<HashMap<Object, Object>>();
		try
		{
			DDGZList = this.getListBySQL("getDDGZList", param);
		}catch(Exception e)
		{
			e.printStackTrace();
			throw new BusinessException(CommonEnum.BusinessException.ERROR_SYSTEM);
		}
		return DDGZList; 
	}
	
	public List<HashMap<Object,Object>> getKHDDByKHDD(HashMap<Object,Object> param){
		List<HashMap<Object,Object>> KHDDList =  new ArrayList<HashMap<Object, Object>>();
		try
		{
			KHDDList = this.getListBySQL("getKHDDByKHDD", param);
		}catch(Exception e)
		{
			throw new BusinessException(CommonEnum.BusinessException.ERROR_SYSTEM);
		}
		return KHDDList; 
	}
}
