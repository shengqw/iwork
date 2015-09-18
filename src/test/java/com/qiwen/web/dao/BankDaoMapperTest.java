package com.qiwen.web.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qiwen.web.po.Bank;

/** 
 * @author qiwen@sheng
 * @version 创建时间：2015年8月31日 下午5:34:18 
 * 类说明 
 */
public class BankDaoMapperTest {
	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	@Test
	public void testGetBankById() {
		BankDaoMapper mapper = (BankDaoMapper) applicationContext.getBean("bankDaoMapper");
		Bank bank = mapper.getBankById("1");
		System.out.println("222="+bank);
		Bank bank2 = mapper.getBankById("1");
		System.out.println(bank2);
	}

}
