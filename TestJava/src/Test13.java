
public class Test13 {

	public static void main(String[] args) {
		Test13C tc = new Test13C();
		
		System.out.println(tc.s);
		System.out.println(tc.getPs());
		
		tc.test();
		tc.test("오버로딩");
		
		Test13P p1 = new Test13P();
		Test13C c1 = new Test13C();
		Test13P p2 = new Test13C();
		//Test13C c2 = new Test13P(); // 에러
		p2.test();
	}

}
