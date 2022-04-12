package com.gd.test.service;

public class Test06Service {
	public static String msg = "Hi!";
	public final String MSG_TWO = "Hello"; // 상수
	public static void test() {
		System.out.println(msg);
	}
	
	public void printMsg() {
		//SingletonTest st = new SingletonTest();
		SingletonTest st = SingletonTest.getInstance();
		st.msg = "Hi";
		System.out.println(st.msg);
	}
	public void printMsg2() {
		//SingletonTest st = new SingletonTest();
		SingletonTest st = SingletonTest.getInstance();
		
		System.out.println(st.msg);
	}
}
