package com.gd.test.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.gd.test.service.Test05Service;

public class Test05Controller {

	public static void main(String[] args) {
		Date dt = new Date();
		// new SimpleDateFormat(패턴) : 패턴의 형태로 날짜를 제공
 		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E a HH:mm:ss");
 		
 		System.out.println(sdf.format(dt));
 		
 		try {
// 			throw new Exception();
 			
 			int[] arr = new int[3];
 			arr[3] = 3;
 			Integer.parseInt("adc");
 		} catch(NumberFormatException ne) {
 			// printStackTrace() : Java에 현재 발생한 예외사항을 출력요청
 			ne.printStackTrace(); 
 			// toString() : 예외 기본정보를 문자열로 취득
 			System.out.println(ne.toString());
 		} catch(Exception e) {
 			e.printStackTrace();
 		} finally {
 			System.out.println("파이널!");
 		}
 		
 		System.out.println("마지막 부분");
 		
 		Test05Service ts = new Test05Service();
 		
 		
		try {
			ts.test();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
	}

}
