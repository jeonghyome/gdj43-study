
public class Test12 {

	public static void main(String[] args) {
		float a = 3.1415f;
		
		System.out.println(Math.ceil(a * 100) / 100); // 올림 
		System.out.println(Math.floor(a)); // 버림
		System.out.println(Math.round(a * 100) / 100f); // 반올림
		
		int b = -7;
		System.out.println(Math.abs(b)); // 절대값
		
		System.out.println(Math.random()); 
		
		System.out.println((int)Math.floor(Math.random() * 45) + 1);
		
	}

}
