package com.frame.control.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frame.mapper.test.testMapper;

@Controller
@RequestMapping(value="test")
public class testControl {
	@Autowired
	private testMapper testmapper;
	
	@RequestMapping(value="testfun")
	@Transactional
	public void testfun()
	{
		System.out.println("test");
		testmapper.insertTest();
		throw new RuntimeException();
//		System.out.println("test end");
	}

}
