package com.frame.control.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frame.service.test.testService;

@Controller
@RequestMapping(value = "test")
public class testControl {
	@Autowired
	private testService testservice;
		
	@RequestMapping(value = "testfun")
	public void testfun() {
		try {
			testservice.testfun();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
