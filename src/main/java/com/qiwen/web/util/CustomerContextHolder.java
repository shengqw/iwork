package com.qiwen.web.util;
/** 
 * @author qiwen@sheng
 * @version 创建时间：2015年9月2日 下午3:11:31 
 * 类说明 
 */
public class CustomerContextHolder {
	public static final String DATA_SOURCE_JEECG = "jeecgDataSource";
	public static final String DATA_SOURCE_GWALL = "gwallDataSource";
	//线程安全
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
	
	public static void setCustomerType(String customerType) {  
        contextHolder.set(customerType);  
    }  
      
    public static String getCustomerType() {  
        return contextHolder.get();  
    }  
      
    public static void clearCustomerType() {  
        contextHolder.remove();  
    }  

}
