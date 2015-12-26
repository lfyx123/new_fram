package com.frame.service.order;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frame.mapper.order.OrderMapper;
import com.frame.service.base.BusinessException;
import com.frame.service.base.CommonEnum;

@Service
public class OrderService {
	@Autowired
	private OrderMapper orderMapper;

	@Transactional
	public HashMap<Object,Object> getOrderInfo(HashMap<Object, Object> param) {
		HashMap<Object,Object> resultMap = new HashMap<Object, Object>();
		try
		{
			List<HashMap<Object,Object>> KHQSDList = orderMapper.getKHQSDList(param);
			HashMap<Object,Object> KHDD = orderMapper.getKHDD(param);
			HashMap<Object,Object> KHDDZT = orderMapper.getKHDDZT(param);
			List<HashMap<Object,Object>> ysddList = orderMapper.getYSDDSJList(param);
			HashMap<Object,Object> YDSJZT = ysddList.size()==0?null:ysddList.get(0);
			HashMap<Object,Object> YDZT = orderMapper.getYDZT(param);
			List<HashMap<Object,Object>> DDGZList = orderMapper.getDDGZList(param);
			resultMap.put("KHQSDList", KHQSDList);
			resultMap.put("KHDD", KHDD);
			resultMap.put("KHDDZT", KHDDZT);
			resultMap.put("YDSJZT", YDSJZT);
			resultMap.put("YDZT", YDZT);
			resultMap.put("DDGZList", DDGZList);
		}catch(BusinessException e)
		{
			throw e;
		}catch(Exception e)
		{
			throw new BusinessException(CommonEnum.BusinessException.ERROR_SYSTEM);
		}
		return resultMap;
	}
	
	@Transactional
	public HashMap<Object,Object> getOrderInfoByKHDD(HashMap<Object,Object> param) {
		HashMap<Object,Object> resultMap = new HashMap<Object, Object>();
		try
		{
			List<HashMap<Object,Object>> KHDDList = orderMapper.getKHDDByKHDD(param);
			resultMap.put("KHDDList", KHDDList);
		}catch(BusinessException e)
		{
			throw e;
		}catch(Exception e)
		{
			throw new BusinessException(CommonEnum.BusinessException.ERROR_SYSTEM);
		}
		return resultMap;
	}
}
