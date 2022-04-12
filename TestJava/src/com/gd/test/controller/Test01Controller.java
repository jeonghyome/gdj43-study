package com.gd.test.controller; // 패키지 주소

import java.util.ArrayList;
import java.util.List;

// import : 주소록과 같음. 해당 파일이 어디 있는지를 가져옴
// import에서의 * : 해당 패키지 아래 모든 파일 
import com.gd.test.service.*;

public class Test01Controller {

	public static void main(String[] args) {
		Test01Service ts = new Test01Service();
		
		List<String> list = new ArrayList<String>();
		
		// add(값) : 값을 추가한다.
		list.add("가나다");
		// add(인덱스번호, 값) : 인덱스번호 위치에 값을 추가한다.
		list.add(0, "ABC");
		
		// get(인덱스번호) : 인덱스 번호에 해당하는 값을 가져온다.
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		// indexOf(값) : 값의 위치를 찾는다.
		// listIndexOf(값) : 값의 위치를 뒤에서부터 찾는다.
		System.out.println(list.indexOf("가나다"));
		System.out.println(list.lastIndexOf("가나다"));
		
		// contains(값) : 값의 존재여부 확인 (true, false)
		System.out.println(list.contains("ABC"));
		
		// remove(인덱스번호) : 인덱스번호에 값을 제거하고 다음값을 당겨옴
		list.remove(0);
		System.out.println(list.get(0));
		
		// set(인덱스번호, 값) : 인덱스번호의 내용을 주어진 값으로 변경
		list.set(0, "라마바");
		System.out.println(list.get(0));
		
		// size() : 리스트의 크기를 가져옴
		System.out.println(list.size());
		
		// toString() :문자열로 가져옴
		System.out.println(list.toString());
		
		// isEmpty() : 비어있는지 여부 확인
		System.out.println(list.isEmpty());
		
		// clear() : 모든 내용 제거
		list.clear();
		System.out.println(list.isEmpty());
		
		list.add("가나다");
		list.add("라마바");
		list.add("사아자");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(String s : list) {
			System.out.println(s);
		}
	}
	
}
