package com.qiwen.web.aop;

import java.lang.reflect.Proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.ClassUtils;

import com.qiwen.web.util.CustomerContextHolder;

/** 
 * @author qiwen@sheng
 * @version 创建时间：2015年9月2日 下午3:58:58 
 * 类说明 
 */
public class DataSourceMethodInterceptor implements MethodInterceptor, InitializingBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("-------afterPropertiesSet-------------");
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("---DataSourceMethodInterceptor.invoke()---------");
		Class<?> clazz = invocation.getThis().getClass();
        String className = clazz.getName();
        if (ClassUtils.isAssignable(clazz, Proxy.class)) {
            className = invocation.getMethod().getDeclaringClass().getName();
        }
        String methodName = invocation.getMethod().getName();
//        Object[] arguments = invocation.getArguments();
//        trace("execute {}.{}({})", className, methodName, arguments);
        
        if (className.contains("gwall") || methodName.contains("gwall")) {
            CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_GWALL);
        } else {
            CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_JEECG);
        }
        System.out.println("---DataSourceMethodInterceptor.invoke(1)---------");
        Object result = invocation.proceed();
        System.out.println("---DataSourceMethodInterceptor.invoke(2)---------");
        return result;
	}

}
