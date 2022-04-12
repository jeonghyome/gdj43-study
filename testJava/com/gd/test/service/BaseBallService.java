package com.gd.test.service;

import java.util.Scanner;

public class BaseBallService {
	Scanner sc = new Scanner(System.in);
	String rNum;
	int ball = 0;
	int strike = 0;
	int out = 0;
	int cnt = 0; // 실행 횟수

	public void run() {

		boolean flag = true;

		// 랜덤 숫자

		rNum = Integer.toString((int) Math.floor(Math.random() * 9) + 1);
		// 중복 제거
		for (int i = 1; i < 3; i++) {
			int num = (int) Math.floor(Math.random() * 9) + 1;

			if (rNum.indexOf(Integer.toString(num)) != -1) {
				i--;
			} else {
				rNum += num;
			}
		}

		start: while (flag) {

			String input = sc.nextLine();

			// 숫자 개수 확인
			if (input.equals("9")) {
				System.out.println("종료");
				flag = false;
				break;
			} else if (input.length() != 3) {
				System.out.println("숫자를 3개 입력해 주세요.");
				continue start;
			} else {

				// 중복 입력 화인
				for (int i = 0; i < 2; i++) {
					if (input.indexOf(input.charAt(i), i + 1) != -1) {
						System.out.println("중복된 숫자입니다.");
						continue start;
					}
				}

				// 숫자 비교
				for (int j = 0; j < 3; j++) {
					if (rNum.indexOf(input.charAt(j)) == j) {
						strike++;
					} else if (rNum.indexOf(input.charAt(j)) > -1) {
						ball++;
					}
				}

				out = 3 - strike - ball;
				cnt++;
			}
			System.out.println(cnt + "회 - 입력값 : " + input + " [" + strike + "S " + ball + "B " + out + "O]");

			if (strike == 3) {
				System.out.println("승리!");
				flag = false;
			} else if (cnt == 9) {
				System.out.println("패배!");
				flag = false;
			}

			// 1회 끝나면 초기화
			strike = 0;
			ball = 0;
			out = 0;

		} // while

	}

}
