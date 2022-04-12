package com.gd.test.service;

import java.util.Scanner;

public class NumBaseballService2 {
	Scanner scanner = new Scanner(System.in);
	String rNum;
	int count = 1;
	boolean flag = true;

	public void run() {
		System.out.println("-----------------");
		System.out.println("---- 숫자 야구 ---- ");
		System.out.println("-----------------");
		
		RandomNum();
		
		while(flag) {
			InsertNum();
		}
	}

	
/** 랜덤 숫자 뽑기
 ***************************************************************************
 ***************************************************************************
 */	
	public void RandomNum() {
		rNum = Integer.toString((int)Math.floor(Math.random() * 9) + 1);
		
		for (int i = 1 ; i < 3 ; i++) {
			int num = (int)Math.floor(Math.random() * 9) + 1;
			
			if (rNum.indexOf(Integer.toString(num)) != -1) {
				i--;
			} else {
				rNum += num;
			}
		}		
		System.out.println("rNum : " + rNum);
	}
	
	
/** 숫자 세개 입력하기
 ***************************************************************************
 ***************************************************************************
 */	
	public void InsertNum() {
		System.out.println();
		System.out.println("1~9 중 서로 다른 숫자 세 개를 입력하세요!! ex) 123    [ 리셋:0 / 종료:99 ]");
		
		String temp = scanner.nextLine();
		
		if(temp.indexOf("0") != -1) {
			Reset();
		} else if(temp.indexOf("99") != -1) {
			System.out.println("종료합니다.");
			flag = false;
		} else if(temp.length() != 3) {
			System.out.println("숫자를 3개 입력해 주세요.");
		}
		else {
			boolean check = true;
			
			//같은 숫자가 있는지 검사
			for (int i = 0 ; i < 2 ; i++) {
				if(temp.indexOf(temp.charAt(i), i + 1) != -1) {
					check = false;
					break;
				}
			}
			
			if(!check) {
				System.out.println("같은 숫자는 입력 할 수 없습니다.");
			} else {
				count++;
				
				Result(temp);
			}
		}
	}
	
	
/** 게임 결과 출력
 ***************************************************************************
 ***************************************************************************
 */	
	public void Result(String input) {
		int s = 0;
		int b = 0;
		int o = 0;
		
		for(int i = 0 ; i < 3 ; i++) {
			if(rNum.indexOf(input.charAt(i)) == i) { // 값이 같으며, 위치가 같다.
				s++;
			} else if(rNum.indexOf(input.charAt(i)) > -1) {
				b++;
			}
		}
		
		o = 3 - s - b;
		
		// 결과 출력
		System.out.println("입력값 : " + input + " [" + s + "S " + b + "B " + o + "O]");
		
		// 스트라이크 세개면
		if(s == 3) {
			Victory();
		} else if(count == 10) {
			Over();
		}
		
	} //class end
	
	

/** 승리
 ***************************************************************************
 ***************************************************************************
 */	
	public void Victory() {
		System.out.println("-----------------");
		System.out.println("!!! 승리하였습니다 !!!");
		System.out.println("-----------------");
		Reset();
	}

/** 리셋
 ***************************************************************************
 ***************************************************************************
 */
	public void Reset() {
		rNum = "";
		count = 1;
		
		System.out.println("-----------------");
		System.out.println("---- 숫자 야구 ---- ");
		System.out.println("-----------------");
		
		RandomNum();
	}
	
	
/** 종료
 ***************************************************************************
 ***************************************************************************
 */	
	public void Over() {
		System.out.println();
		System.out.println("-----------------");
		System.out.println("--- Game Over ---");
		System.out.println("-----------------");
		Reset();
	}

} //class end
