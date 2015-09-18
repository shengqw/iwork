package com.qiwen.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qiwen.web.dao.BankDaoMapper;
import com.qiwen.web.po.Bank;
import com.qiwen.web.service.BankService;

/** 
 * @author qiwen@sheng
 * @version 创建时间：2015年9月1日 下午5:57:37 
 * 类说明 
 */

@Service("bankService")
public class BankServiceImpl implements BankService {
	@Autowired
	private BankDaoMapper bankDaoMapper;
	
	public Bank getBankById(String id) {
		return bankDaoMapper.getBankById(id);
	}

}
