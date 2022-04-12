package com.gd.test.controller;

import com.gd.test.bean.TestBean;

public class Test04Controller {

	public static void main(String[] args) {
		TestBean tb = new TestBean();
		
		tb.setNum(1);
		tb.setTitle("Hello");
		tb.setWriter("Jack");
		
		System.out.println(tb.getNum() + "," + tb.getTitle() + "," + tb.getWriter());
	}

}
