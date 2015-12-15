package com.frame.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frame.mapper.testMapper;

@Controller
@RequestMapping(value="test")
public class testControl {
	@Autowired
	private testMapper testmapper;
	@RequestMapping(value="testfun")
	public void testfun()
	{
		System.out.println("test");
		System.out.println(testmapper.getHyInfoA().size());
		System.out.println("test end");
	}

}
