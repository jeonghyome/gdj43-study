import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		// nextLine() : 한줄(엔터기준)을 입력받는다. 입력이 완료될 때까지 대기상태.
		// enter 로 한줄 구분
		String s = sc.nextLine(); 
		System.out.println("입력값 : " + s);
		
		// nextInt() : 입력된 숫자를 정수로 받는다. 띄어쓰기로 구분
		int a = sc.nextInt();
		sc.nextLine(); // 엔터처리 후 끝남
		System.out.println("입력값 : " + a);
		
		// next() : 입력된 문자열 단어를 받는다. 띄어쓰기로 구분
		// String s2 = sc.next();
		String s2 = sc.nextLine();
		System.out.println("입력값 : " + s2);
	}

}
