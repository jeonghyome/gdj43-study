package com.spring.test.service;

import org.springframework.stereotype.Service;


@Service
public class TestService implements ITestService{

	@Override
	public void test() {
		System.out.println("서비스의 테스트 메소드");
		
	}

	@Override
	public String gugudan(int dan) {
		String t = "";
		for(int i = 0; i < 9; i++) {
			t += (dan + "*" + (dan+1) + "=" + dan * (dan+1)) + "<br/>";
		}
		return t;
	}
		

}

