package com.frame.log;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class logAop{
	Logger logger = Logger.getLogger(logAop.class);  
    String logStr = null ;  
	public void before(JoinPoint jp)
	{
		logStr = jp.getTarget().getClass().getName() + " ��� "  
                + jp.getSignature().getName()+" ������ʼִ�� ***Start***";  
        logger.info(logStr);
	}
	
	public void after(JoinPoint jp)
	{
		logStr = jp.getTarget().getClass().getName() + " ��� "  
                + jp.getSignature().getName()+" ��������ִ�� ***End***";  
        logger.info(logStr);
	}
}
