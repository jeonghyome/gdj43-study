
public class Exam02 {

	public static void main(String[] args) {
		// 1 1 2 3 5 8 13 ... 피보나치 수열 10건 출력 
		// 반복문 사용
		// 규칙찾기 , swap로직 비슷
		
//		int a = 1;
//		int b = 1;
//		int temp;
//		
//		for (int i=0; i<=10; i++) {
//			System.out.print(a + " ");
//			temp = a + b; // temp = 2 ...
//			a = b; // a  = 1 ...
//			b = temp; // b = 2 ... 
//		}
		
		int a = 1;
		int b = 0;
		int temp;
		
		for(int i = 0; i < 10; i++) {
			System.out.print(a+ " ");
			temp = a + b;
			b = a;
			a = temp;
			
		}
		
	}

}
