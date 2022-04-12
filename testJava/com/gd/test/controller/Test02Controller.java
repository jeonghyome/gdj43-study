package com.gd.test.controller;

import java.util.ArrayList;
import java.util.List;

public class Test02Controller {

	public static void main(String[] args) {
		// 초기값
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(7);
		list.add(3);
		
		// 오름차순 정렬 구현
		/*
		int temp = 0;
		
		if(list.get(0) > list.get(1)) {
			temp = list.get(0);
			list.set(0, list.get(1));
			list.set(1, temp);
		}
		
		if(list.get(0) > list.get(2)) {
			temp = list.get(0);
			list.set(0, list.get(2));
			list.set(2, temp);
		}
		
		if(list.get(1) > list.get(2)) {
			temp = list.get(1);
			list.set(1, list.get(2));
			list.set(2, temp);
		}

		for(int i = 0; i < list.size() - 1; i++) {
			for(int j = i + 1; j < list.size();  j++) {
				if(list.get(i) > list.get(j)) {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		*/
		/*
		for(int i = 0; i < list.size() - 1; i++) {
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(i) > list.get(j)) {
					list.add(i, list.get(j)); // 작은것을 가져온다
					list.remove(j + 1);
				}
			}
		}
		*/
		/*
		for(int i = 0; i < list.size() - 1; i++) {
			for(int j = list.size() - 1; j > i; j--) {
				if(list.get(i) > list.get(j)) { 
					list.add(list.get(i));
					list.remove(i);
				}
			}
		}
		*/
		list.sort(null);
		
				
		// 출력(건들지 말것)
		for(int a : list) {
			System.out.println(a);
		}
	}

}
