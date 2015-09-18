package com.qiwen.web.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/** 
 * 多数据源
 * @author qiwen@sheng
 * @version 创建时间：2015年9月2日 下午3:09:22 
 * 类说明 
 */
public class MultipleDataSource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		return CustomerContextHolder.getCustomerType();
	}

}
