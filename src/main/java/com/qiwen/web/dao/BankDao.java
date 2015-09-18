package com.qiwen.web.dao;

import com.qiwen.web.po.Bank;

/** 
 * @author qiwen@sheng
 * @version 创建时间：2015年8月31日 下午4:03:56 
 * 类说明 
 */
public interface BankDao {
	public Bank findBankById(String id);
	
	public Bank findBankFromJeecgById(String id);

}
