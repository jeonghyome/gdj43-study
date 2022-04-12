
public class Test02 {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;

		// 사칙 연산
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		// 비교 연산(왼쪽 기준)
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);

		// 증감 연산
		a += 3;
		System.out.println(a);

		a -= 3;
		System.out.println(a);

		a *= 3;
		System.out.println(a);

		a /= 3;
		System.out.println(a);

		a %= 3;
		System.out.println(a);
		// 출력, 저장된 값
		System.out.println(a++);// 2, 3
		System.out.println(++a);// 4, 4
		System.out.println(a--);// 4, 3
		System.out.println(--a);// 2, 2

		a = 1;

		// 조건문 if
		if (a >= 2) {
			// 조건1 값이 true이면 실행
			System.out.println("a는 2보다 크거나 같다");
		} else if (a == 1) {
			// 조건1이 false이고 조건2가 true이면 실행
			System.out.println("a는 1과 같다");
		} else {
			// 조건1,2가 false이면 실행
			System.out.println("a는 1보다 작다");
		}

		System.out.println("if문 끝");

	}

}