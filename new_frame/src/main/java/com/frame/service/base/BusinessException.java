package com.frame.service.base;

/**
 * @author lyl
 * @date 2015��12��19��
 * @version 1.0.0
 * ҵ���쳣��
 * 		code:�쳣��
 * 		message:�쳣��Ϣ
 * 		index:�쳣����
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
