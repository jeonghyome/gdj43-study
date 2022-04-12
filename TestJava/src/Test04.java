
public class Test04 {

	public static void main(String[] args) {
		int a = 1; // 초기값

		while (a < 10) { // 조건
			System.out.println("2 * " + a + " = " + (2 * a)); // 2단
			a++; // 증감값
		}
		
		do {
			System.out.println(a);
			a++;
		} while (a < 10);

		for (int i = 1; i < 10; i++) {
			System.out.println("3 * " + i + " = " + (3 * i)); // 3단
		}
		
		// 1 ~ 100까지의 합계를 반복문으로 구하시오.
		// 누적이 필요. 보관할 공간 필요.
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i; // sum 누적값 저장
		}
		System.out.println(sum); // 출력
		
		// 1 ~ 100사이의 2배수 또는 3배수를 출력하시오.
		// 배수 : 해당 숫자로 나누었을 때 나머지가 0
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
	}

}
