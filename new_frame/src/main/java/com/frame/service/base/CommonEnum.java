package com.frame.service.base;

/**
 * @author lyl
 * @date 2015��12��19��
 * @version 1.0.0
 * ҵ���쳣ö��
 * 		message:�쳣��Ϣ
 * 		index:�쳣����
 * 		getIndex():��ȡ����
 * 		getMessage():��ȡ��Ϣ
 * 		getCode():��ȡ����
 */
public interface CommonEnum {
	public static enum BusinessException implements CommonEnum{
		ERROR_BUSINESS("ҵ���߼��쳣",1),
		ERROR_SYSTEM("ϵͳ�쳣",2);

		
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
}
