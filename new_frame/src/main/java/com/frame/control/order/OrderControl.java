package com.frame.control.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frame.service.order.OrderService;

@Controller
@RequestMapping(value = "order")
public class OrderControl {
	@Autowired
	private OrderService orderService;
		
	@RequestMapping(value = "orderfun")
	public void testfun() {
		try {
//			testservice.testfun();
			System.out.println("in this control!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
