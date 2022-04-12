package com.gd.test.service;

public class SingletonTest {
	private static SingletonTest instance;
	
	public String msg = "Hello!!";
	
	
	public static SingletonTest getInstance() {
		if(instance == null) {
			instance = new SingletonTest();
		}
		return instance;
	}
	
}
