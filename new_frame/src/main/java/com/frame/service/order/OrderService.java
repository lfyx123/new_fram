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
	public List<HashMap<Object,Object>> getOrderInfo() {
		try
		{
			return orderMapper.getOrderInfo();
		}catch(BusinessException e)
		{
			throw e;
		}catch(Exception e)
		{
			throw new BusinessException(CommonEnum.BusinessException.ERROR_SYSTEM);
		}
	}
}
