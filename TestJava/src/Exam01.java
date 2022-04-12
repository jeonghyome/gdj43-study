
public class Exam01 {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c = 3;

		// 오름차순으로 출력하기
		int temp = 0; // temp 변수 생성

		if (a > b) {
			temp = a; // temp 변수에 b변수값 저장
			a = b; // b 변수에 a변수값 저장
			b = temp; // a 변수에 temp변수값 저장
		}
		if (a > c) {
			temp = a;
			a = c;
			c = temp;
		}
		if (b > c) {
			temp = b;
			b =  c;
			c = temp;
		}

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
