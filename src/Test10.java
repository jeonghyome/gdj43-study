
public class Test10 {

	public static void main(String[] args) {
		Test10s ts = new Test10s();
		
		System.out.println(ts);
		System.out.println(ts.s); // Hello
		
		ts.test(); // test메소드 실행
		System.out.println(ts.intPlus(1, 2)); // 더하기
		System.out.println(ts.intM(5, 3)); // 빼기
		System.out.println(ts.intMp(2, 5)); // 곱하기
		System.out.println(ts.intD(6, 2)); // 나누기
		System.out.println(ts.intR(6, 3)); // 나머지
		
		
		
	}

}
