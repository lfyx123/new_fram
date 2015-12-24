package com.frame.control.order;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.frame.service.base.BusinessException;
import com.frame.service.base.CommonEnum;
import com.frame.service.order.OrderService;

@Controller
@RequestMapping(value = "order")
public class OrderControl {
	@Autowired
	private OrderService orderService;
		
	@RequestMapping(value = "orderfun")
	public @ResponseBody String testfun(HttpServletRequest request,   
            HttpServletResponse response) {
		HashMap<Object, Object> resultMap = new HashMap<Object, Object>();
		String callback = request.getParameter("callback"); 
		ObjectMapper mapper = new ObjectMapper();  
		String result = "";
		try 
		{
			//查询订单信息
			List<HashMap<Object,Object>> orderInfoList = orderService.getOrderInfo();
			resultMap.put("orderInfoList", orderInfoList);
			resultMap.put("result", CommonEnum.SUCCESS.SEARCH_SUCCESS.getCode());
			resultMap.put("message", CommonEnum.SUCCESS.SEARCH_SUCCESS.getMessage());
			//解决AJAX跨域问题  
			result = callback+"("+mapper.writeValueAsString(resultMap)+")"; 
		} 
		catch (BusinessException e) 
		{
			resultMap.put("result", e.getCode());
			resultMap.put("message", e.getMessage());
		}catch(Exception e)
		{
			resultMap.put("result", CommonEnum.BusinessException.ERROR_SYSTEM.getCode());
			resultMap.put("message", CommonEnum.BusinessException.ERROR_SYSTEM.getMessage());
		}
        return result;
	}

}
