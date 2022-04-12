package com.gd.test.controller;

import java.util.Scanner;

import com.gd.test.service.Test06Service;

public class Test06Controller {

	public static void main(String[] args) {
		System.out.println(Test06Service.msg);
		
		Test06Service.test();
		Test06Service ts = new Test06Service();
		
		System.out.println(ts.MSG_TWO);
		
		ts.printMsg();
		ts.printMsg2();
	
		Scanner sc = new Scanner(System.in);
		int[] RandomNum = new int[3];
		for (int j = 0; j < 3; j++) {
			RandomNum[j] = (int) Math.floor(Math.random() * 9) + 1; // 랜덤값
			for (int k = 0; k < j; k++) {
				if (RandomNum[j] == RandomNum[j]) {
					j--;
					break;
				}
			}
		}
		String Num = "";
		Num = sc.nextLine();
		
		System.out.println(Num.charAt(0));
		
		
	}

}
