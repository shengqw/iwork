package com.qiwen.web.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.qiwen.web.dao.BankDao;
import com.qiwen.web.po.Bank;

/** 
 * @author qiwen@sheng
 * @version 创建时间：2015年8月31日 下午4:04:55 
 * 类说明 
 */
public class BankDaoImpl extends SqlSessionDaoSupport implements BankDao {
	public Bank findBankById(String id) {
		SqlSession sqlSession1 = this.getSqlSession();
		SqlSession sqlSession2 = this.getSqlSession();
		Bank bank = sqlSession1.selectOne("bank.getBankById", id);
		System.out.println(bank);
		Bank bank2 = sqlSession2.selectOne("bank.getBankById", id);
		System.out.println(bank2);
		
//		sqlSession1.close();
//		sqlSession2.close();
		return bank;
	}

}
