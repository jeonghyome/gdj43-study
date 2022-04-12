
public class Exam05 {

	public static void main(String[] args) {

		// 문제1. 54321초가 몇시간 몇분 몇초인지 구하시요.
		// 15시간 5분 21초
		int time = 54321;
		int hour = 0;
		int minute = 0;
		int second = 0;
		hour = time / 3600;
		minute = (time % 3600) / 60;
		second = time % 60;
		System.out.println(time + "초 : " + hour + "시간 " + minute + "분 " + second + "초");

		// 문제2. 1! + 2! + 3! + 4! + 5!의 결과를 구하시요.
		// 5! = 1 * 2 * 3 * 4 * 5
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			int facto = 1;
			for (int j = 2; j <= i; j++) {
				facto *= j;
			}
			sum += facto;
		}
		System.out.println(sum);

		// 문제3. 66을 소인수 분해하시오.
		// 소인수분해 = 소수들로 나누어서 더 나누어지지 않는 것
		// 6을 소인수 분해 할 경우 = 2 * 3
		int val = 66;
		boolean flag = true;

		System.out.print(val + "의 소인수 분해 : ");

		for (int i = 2; i <= val; i++) { // val 까지
			if (val % i == 0) {
				if (flag) {
					System.out.print(i);
					flag = false;
				} else {
					System.out.print(" * " + i);
				}
				val /= i;
				i--;
			}
		}

		// 표기법
		String helloWorldJavaVariable = "카멜"; // 첫단어만 소문자
		String HelloWorldJavaVariable = "파스칼"; // 단어 첫글자가 대문자
		String hello_world_java_variable = "스네이크"; // 단어 사이 언더바(_)

	}

}
