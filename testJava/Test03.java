
public class Test03 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String c = "30";

		System.out.println(a + b + c);
		System.out.println(c + b + a);
		System.out.println(a + (b + c));

		switch (a) {
		case 10:
			System.out.println("a는 10입니다.");
			break;
		case 20:
			System.out.println("a는 10입니다.");
			break;
		default:
			System.out.println("a는 10도 20도 아닙니다.");
		}

		int score = 78;

		// 조건문을 활용하여 학점을 출력하십시오.
		// A학점 90 ~ 100, B학점 80 ~ 89, C 70 ~ 79, D 60 ~ 69, F 나머지
		// if와 switch로 구현하시오.
		if (score >= 90) {
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else if (score >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}

		// score / 10 나눈값
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
		}
	}

}
