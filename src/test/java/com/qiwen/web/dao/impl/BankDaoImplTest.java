package com.qiwen.web.dao.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qiwen.web.dao.BankDao;
import com.qiwen.web.po.Bank;
import com.qiwen.web.util.CustomerContextHolder;

/** 
 * @author qiwen@sheng
 * @version 创建时间：2015年8月31日 下午4:25:04 
 * 类说明 
 */
@ContextConfiguration({"classpath:spring/applicationContext-dao.xml","classpath:spring/applicationContext-aop.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BankDaoImplTest {
	
	@Autowired()
	private BankDao bankDaoTemp;
//	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
//		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
	}

	@Test
	public void testFindBankById() {
//		BankDao bankDao = (BankDao) applicationContext.getBean("bankDao");
//		bankDao.findBankById("1");
//		System.out.println(bank);
	}
	
	@Test
	public void testBankDaoTemp(){
		bankDaoTemp.findBankById("1");
		CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_GWALL);
//		BankDao bankDao = (BankDao) applicationContext.getBean("bankDaoTemp");
		bankDaoTemp.findBankById("2");
	}
	
	@Test
	public void testFindBankFromJeecgById(){
		bankDaoTemp.findBankFromJeecgById("1");
	}

}
