package com.frame.log;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class logAop{
	Logger logger = Logger.getLogger(logAop.class);  
    String logStr = null ;  
	public void before(JoinPoint jp)
	{
		logStr = jp.getTarget().getClass().getName() + " 类的 "  
                + jp.getSignature().getName()+" 方法开始执行 ***Start***";  
        logger.info(logStr);
	}
	
	public void after(JoinPoint jp)
	{
		logStr = jp.getTarget().getClass().getName() + " 类的 "  
                + jp.getSignature().getName()+" 方法结束执行 ***End***";  
        logger.info(logStr);
	}
}
