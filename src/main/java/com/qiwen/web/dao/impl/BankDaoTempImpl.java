package com.qiwen.web.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.qiwen.web.dao.BankDao;
import com.qiwen.web.po.Bank;

/** 
 * @author qiwen@sheng
 * @version 创建时间：2015年9月2日 上午10:19:39 
 * 类说明 
 */
@Repository("bankDaoTemp")
public class BankDaoTempImpl implements BankDao {
	
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	@Qualifier("sqlSession")
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public Bank findBankById(String id) {
		Bank bank = this.sqlSession.selectOne("bank.getBankById", id);
		System.out.println(bank);
		return bank;
	}

	@Override
	public Bank findBankFromJeecgById(String id) {
		System.out.println("------findBankFromJeecgById-------------");
		Bank bank = this.sqlSession.selectOne("bank.getBankById", id);
		System.out.println(bank);
		return bank;
	}

}
