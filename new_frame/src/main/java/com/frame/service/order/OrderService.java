package com.frame.service.order;

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
	public void testfun() {
		orderMapper.insertTest();
		throw new BusinessException(CommonEnum.BusinessException.ERROR_BUSINESS);
	}
}
