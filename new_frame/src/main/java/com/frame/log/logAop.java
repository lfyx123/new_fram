package com.frame.log;
/**
 * @author lyl
 * @date 2015年12月19日
 * @version 1.0.0
 * 日志拦截AOP
 * 		before():方法调用前拦截
 * 		after():方法调用后拦截
 */
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
