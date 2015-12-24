package com.frame.service.base;

/**
 * @author lyl
 * @date 2015年12月19日
 * @version 1.0.0
 * 业务异常枚举
 * 		message:异常消息
 * 		index:异常索引
 * 		getIndex():获取索引
 * 		getMessage():获取消息
 * 		getCode():获取代码
 */
public interface CommonEnum {
	//异常枚举
	public static enum BusinessException implements CommonEnum{
		ERROR_BUSINESS("业务逻辑异常",1),
		ERROR_SYSTEM("系统异常",2);

		
        private String message;
        private int index;
        
		private BusinessException(String message, int index) {
            this.message = message;
            this.index = index;
        }
		
		public String getMessage()
		{
			return message;
		}
		
		public int getIndex()
		{
			return index;
		}
		
		public String getCode()
		{
			return this.toString();
		}
	}
	
	//正常枚举
	public static enum SUCCESS implements CommonEnum{
		SEARCH_SUCCESS("success",1),
		ADD_SUCCESS("success",2);

		
        private String message;
        private int index;
        
		private SUCCESS(String message, int index) {
            this.message = message;
            this.index = index;
        }
		
		public String getMessage()
		{
			return message;
		}
		
		public int getIndex()
		{
			return index;
		}
		
		public String getCode()
		{
			return this.toString();
		}
	}
}
