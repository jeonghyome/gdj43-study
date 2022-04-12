
public class Test08 {

	public static void main(String[] args) {
		// 선언
		int[] arr = {1, 3, 5};
		
		System.out.println(arr[1]);
		
		arr[0] = 4; // 1 -> 4
		
		System.out.println(arr[0]);
		
		// length() : 배열의 크기
		System.out.println(arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	
		for(int a : arr) {
			System.out.println(a);
		}
		
		String s = "딸기,사과,포도";
		
		// split(값) : 값을 기준으로 문자열을 자르고 배열로 변환
		String[] arrs = s.split(",");
		
		System.out.println(arrs.length);
		
		for(String t : arrs) {
			System.out.println(t);
		}
		
		
		
		
	}
}
