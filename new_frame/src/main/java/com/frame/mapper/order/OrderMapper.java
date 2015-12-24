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
	public List<HashMap<Object,Object>> getKHQSDList(){
		List<HashMap<Object,Object>> KHQSDList =  new ArrayList<HashMap<Object, Object>>();
		try
		{
			KHQSDList = this.getListBySQL("getKHQSDList", null);
		}catch(Exception e)
		{
			throw new BusinessException(CommonEnum.BusinessException.ERROR_SYSTEM);
		}
		return KHQSDList; 
	}
	
	public HashMap<Object,Object> getKHDD(){
		HashMap<Object,Object> KHDD =  new HashMap<Object, Object>();
		try
		{
			KHDD = this.findOne("getKHDDList", null);
		}catch(Exception e)
		{
			throw new BusinessException(CommonEnum.BusinessException.ERROR_SYSTEM);
		}
		return KHDD; 
	}
	
	public HashMap<Object,Object> getKHDDZT(){
		HashMap<Object,Object> KHDDZT =  new HashMap<Object, Object>();
		try
		{
			KHDDZT = this.findOne("getKHDDZT", null);
		}catch(Exception e)
		{
			throw new BusinessException(CommonEnum.BusinessException.ERROR_SYSTEM);
		}
		return KHDDZT; 
	}
	
	public List<HashMap<Object,Object>> getYSDDSJList(){
		List<HashMap<Object,Object>> YSDDSJList =  new ArrayList<HashMap<Object, Object>>();
		try
		{
			YSDDSJList = this.getListBySQL("getYSDDSJList", null);
		}catch(Exception e)
		{
			throw new BusinessException(CommonEnum.BusinessException.ERROR_SYSTEM);
		}
		return YSDDSJList; 
	}
	
	public HashMap<Object,Object> getYDZT(){
		HashMap<Object,Object> YDZT =  new HashMap<Object, Object>();
		try
		{
			YDZT = this.findOne("getYDZT", null);
		}catch(Exception e)
		{
			throw new BusinessException(CommonEnum.BusinessException.ERROR_SYSTEM);
		}
		return YDZT; 
	}
	
	public List<HashMap<Object,Object>> getDDGZList(){
		List<HashMap<Object,Object>> DDGZList =  new ArrayList<HashMap<Object, Object>>();
		try
		{
			DDGZList = this.getListBySQL("getDDGZList", null);
		}catch(Exception e)
		{
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
