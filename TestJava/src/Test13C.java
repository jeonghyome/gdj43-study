
public class Test13C extends Test13P {
	String s = "자식변수";
	
	public String getPs() {
		// super : 부모클래스
		return super.s;
	}
	
	public void test() {
		System.out.println("테스트 : 자식");
	}
	
}
