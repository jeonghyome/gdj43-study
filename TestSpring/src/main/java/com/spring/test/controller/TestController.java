package com.spring.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.test.bean.TestBean;
import com.spring.test.service.ITestService;

//Controller임을 작성
@Controller
public class TestController{
	//@Autowired : 아래 지정된 인터페이스를 찾아서 객체 주입
	public ITestService iTestService;
	
	
	// RequestMapping : 주소와 메소드 연결
	@RequestMapping(value = "/test1")
	// ModelAndView : 데이터를 담으며, 화면 또는 화면정보를 담을 수 있는 클래스
	// Model 클래스와 View 클래스를 합친 상태
	// Spring에서 RequestMapping에 연결된 메소드의 경우 인자는 자동으로 넘어온다.
	public ModelAndView testA(ModelAndView mav) {
		//setViewName : View(jsp)의 위치정보를 담는다.
		//ViewResolver로 인하여 최종 위치정보는 다음과 같이 바뀜
		// "/WEB-INF/views/" + "test/test1" + ".jsp"
		// "/WEB-INF/views/test/test1.jsp"
		mav.setViewName("test/test1");
		
		return mav; // Spring Servlet에 전달
	}
	
	@RequestMapping(value = "/test2")
	public ModelAndView test2(HttpServletRequest req,
			@RequestParam String msg, //@RequestParam : 요청에서 값을 받아온다. 변수명과 키가 같으면 값을 넣어줌
			@RequestParam(value = "msg") String s, //@RequestParam(name 또는 value) : 키가 같으면 변수에 값을 넣어줌
			@RequestParam HashMap<String, String> params, //@RequestParam에 HashMap이 오면 키와 값들을 자동 할당
			TestBean tb, //Bean이 온 경우 이름이 일치하는 키와 값을 할당
			@RequestParam String cb, //문자열로 받을 경우만 복수의 데이터가 같은 이름인 경우 , 로 구분하여 들어옴. 그 외는 처음것만
			@RequestParam(value = "cb") ArrayList<String> list, // 복수의 데이터를 리스트나 배열로 받으면 차례대로 추가한다.
			@RequestParam(required = false) String test, // 키가 넘어오지 않는 경우 문제가 발생하기에 옵션을 지정한다.
														// required : 필수여부(키가 명확한 경우에만)
			ModelAndView mav){
		
		//getParameter(키) : 키에 해당하는 값을 가져온다.
		System.out.println(req.getParameter("msg"));
		System.out.println(msg);
		System.out.println(s);
		System.out.println(params.get("msg2"));
		System.out.println(tb.getMsg2());
		System.out.println(params.get("cb"));
		System.out.println(cb);
		System.out.println(list.toString());
		System.out.println(test);
		
		//Controller에서 view에 값 전달
		//addObject(키, 값) : 해당 키로 값을 view에 전달. Model의 기능
		mav.addObject("csend", "컨트롤러에서 보냄");
		
		List<HashMap<String, String>> board = new ArrayList<HashMap<String, String>>();
		
		for(int i = 10; i > 0; i--) {
			HashMap<String, String> data = new HashMap<String, String>();
			
			data.put("no", Integer.toString(i));
			data.put("title", "Test" + i);
			data.put("writer", "Test" + i);
			
			board.add(data);
		}
		
		mav.addObject("board", board);
		
		//HttpServletRequest : 요청 객체
		//setAttribute(키, 값) : 해당 키로 값을 view에 전달
		req.setAttribute("rcsend", "컨트롤러에서 보냄2");
		
		mav.setViewName("test/test2");
		
		return mav;
		
	}
	
	@RequestMapping(value = "/test3")
	public ModelAndView test3(ModelAndView mav) {
		iTestService.test();
		
		mav.setViewName("test/test3");
		
		return mav;
	}
	
	@RequestMapping(value = "/test4")
	public ModelAndView test4(ModelAndView mav,
			@RequestParam int dan) { //단 값 취득
		// 서비스 호출하여 구구단 결과 취득
		String res = iTestService.gugudan(dan);
		
		//취득한 데이터 화면에 전송
		mav.addObject("gugu", res);
		
		mav.setViewName("test/test4");
		
		return mav;
	}
}