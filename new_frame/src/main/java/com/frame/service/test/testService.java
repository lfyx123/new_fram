package com.frame.service.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frame.mapper.test.testMapper;
import com.frame.service.base.BusinessException;
import com.frame.service.base.CommonEnum;

@Service
public class testService {
	@Autowired
	private testMapper testmapper;

	@Transactional
	public void testfun() {
		testmapper.insertTest();
		throw new BusinessException(CommonEnum.BusinessException.ERROR_BUSINESS);
	}
}
