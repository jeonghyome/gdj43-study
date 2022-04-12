package com.gd.test.controller;

import com.gd.test.service.BaseBallService;

public class BaseBallController {

	public static void main(String[] args) {
		BaseBallService bs = new BaseBallService();
		System.out.println("==================");
		System.out.println("     야구 게임      ");
		System.out.println("==================");
		System.out.println("컴퓨터를 이겨라 기회는 총 9번 (중복X)");
		System.out.println("숫자를 입력하세요. (3자리 숫자만), 종료 (9번)");
		bs.run();
	}

}