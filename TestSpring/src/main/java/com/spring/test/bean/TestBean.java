package com.spring.test.bean;

import org.springframework.stereotype.Component;

@Component
public class TestBean {
	private String msg;
	private String msg2;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg2() {
		return msg2;
	}
	public void setMsg2(String msg2) {
		this.msg2 = msg2;
	}
	
	
}