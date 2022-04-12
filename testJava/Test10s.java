
public class Test10s {
	public String s = "Hello";
	/* 
	 * 기본생성자는 기본적으로 생략이 가능하다.
	 * 다만, 추가생성자가 존재하고 기본생성자를 사용하려면
	 * 반드시 기본생성자를 선언하여야 사용이 가능하다.
	 */ 
	// 생성자
	// 생성자는 보편적으로 초기값 지정 시 사용
	public Test10s() {
		String s = "abc";
		System.out.println(this.s);
		System.out.println("기본생성자 호출");
	}
	
	public Test10s(String str) {
		System.out.println("추가생성자 호출 : " + str);
	}
	
	public void test() {
		System.out.println("테스트 메소드 실행");
	}
	
	public int intPlus(int a, int b) {
		return a + b;
	}
	
	public int intM(int a, int b) {
		return a - b;
	}
	
	public int intMp(int a, int b) {
		return a * b;
	}
	
	public int intD(int a, int b) {
		return a / b;
	}
	
	public int intR(int a, int b) {
		return a % b;
	}
	
}
