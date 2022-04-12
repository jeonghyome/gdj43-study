package com.gd.test.controller;

import com.gd.test.service.AquaService;

public class AquaController {

	public static void main(String[] args) {
		AquaService as = new AquaService();
		System.out.println("==================");
		System.out.println("     수족관 경영           ");
		System.out.println("==================");
		as.run();
	}

}
