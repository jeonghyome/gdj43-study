package com.gd.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test03Controller {

	public static void main(String[] args) {
		HashMap<String, String> map =
				new HashMap<String, String>();
		
		// put(값1, 값2) : 값1이 키인 값2를 추가한다.
		map.put("이름", "홍길동");
		map.put("나이", "108");
		// get(값1) : 키가 값1인 것의 값을 가져온다.
		System.out.println(map.get("이름"));
		// replace(값1, 값2) : 값1이 키인 것의 값을 값2로 바꾼다.
		// put과 replace가 동일하게 기능제공
		map.replace("이름", "김철수");
		System.out.println(map.get("이름"));
		map.put("이름", "가나다");
		System.out.println(map.get("이름"));
		// remove(값) : 값이 키인 것을 제거한다.
		map.remove("나이");
		// 키에 해당하는 것이 없으면 null
		System.out.println(map.get("나이"));
		// containsKey(값) : 값에 해당하는 키가 있는지 여부
		// containsValue(값1) : 값1에 해당하는 값이 있는지 여부
		System.out.println(map.containsKey("나이"));
		System.out.println(map.containsValue("가나다"));
		// isEmpty() : map이 비어 있는지
		// size() : 들어있는 개수
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		
		map.put("나이", "123");
		// keySet() : map의 키르 set으로 변환
		Set<String> keySet = map.keySet();
		// iterator() : set형태의 데이터를 iterator형태로 변환
		Iterator<String> keys = keySet.iterator();
		// hasNext() : iterator의 현재 포인트 다음값이 존재하는지 여부
		while(keys.hasNext()) {
			// next() : iterator의 현재 포인트 다음 값을 가져옴
			String key = keys.next();
			System.out.println(key + ":" + map.get(key));
		}
		
		
		
		List<HashMap<String, String>> list 
			= new ArrayList<HashMap<String, String>>(); // HashMap 타입 List 변수
		
		for(int i = 10; i > 0; i--) {
			HashMap<String, String> data
							= new HashMap<String, String>(); // HashMap 타입 data 변수
			data.put("번호", Integer.toString(i));
			data.put("제목", "Test중 - " + i);
			data.put("작성자", "김철수");
			
			list.add(data); // data 안에 HashMap 키 와 값을 list에 추가
		}
		
		for(HashMap<String, String> data : list) {
			System.out.println(data.get("번호") + " , " + 
								data.get("제목") + " , " + 
								data.get("작성자"));
		}
		
	}

}
