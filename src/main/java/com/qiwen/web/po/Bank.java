package com.qiwen.web.po;

import java.io.Serializable;

/** 
 * @author qiwen@sheng
 * @version 创建时间：2015年8月31日 下午3:54:03 
 * 类说明 
 */
public class Bank implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String code;
	
	public String a;
	public int b; 
	public Double c;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", code=" + code + "]";
	}
}
