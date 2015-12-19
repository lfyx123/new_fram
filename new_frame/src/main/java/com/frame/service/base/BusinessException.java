package com.frame.service.base;

/**
 * @author lyl
 * @date 2015年12月19日
 * @version 1.0.0
 * 业务异常类
 * 		code:异常码
 * 		message:异常消息
 * 		index:异常索引
 */
public class BusinessException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	private String code;
	private String message;
	private Integer index;
	
	public BusinessException(String code,Integer index,String message)
	{
		this.code = code;
		this.index = index;
		this.message = message;
	}
	
	public BusinessException(CommonEnum.BusinessException errorBusiness)
	{
		this.code = errorBusiness.getCode();
		this.index = errorBusiness.getIndex();
		this.message = errorBusiness.getMessage();
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	
	
}
