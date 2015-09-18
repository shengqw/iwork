package com.qiwen.web.controll;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qiwen.web.po.Bank;
import com.qiwen.web.service.BankService;


/** 
 * @author qiwen@sheng
 * @version 创建时间：2015年9月1日 下午3:04:12 
 * 类说明 
 */
@Controller
@RequestMapping("/bank")
public class BankController  {
	
	
	@Autowired
	private BankService bankService;
	
	
	@RequestMapping("/queryBankList")
	public ModelAndView queryBankList() throws Exception {
		List<Bank> list = new ArrayList<Bank>();
		
		Bank bank = bankService.getBankById("1");
		list.add(bank);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",list);
		mav.setViewName("login/bankList");
		return mav;
	}
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		System.out.println(BankController.class.getName());
		System.out.println(BankController.class.getClassLoader());
		
		Class c = Bank.class;
		Field field[] = c.getFields();
		System.out.println(field.length);
	}

}
