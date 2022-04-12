
public class Test05 {

	public static void main(String[] args) {
		// 1에서 100까지 소수를 구하시오.
		// 소수 : 1과 자기자신으로만 나누어지는 수
		// 1 ~ 100을 만드는 반복문
		// 1 ~ 현재값 사이의 값을 구하여 나누어보는 반목문

		int num = 53;
		// 1. 나누어지는 개수로 구별
		int cnt = 0;
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				cnt++;
			}
		}
		
		if(cnt == 2) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
		
		boolean res = true;
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				res = false; // 1과 자기자신을 제외하고 나누어졌을 때
							 // res에 false
				break; // 소수가 아니기 때문에 더이상의 검증이 필요없음 
			}
		}
		
		if(res) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
		
		for(int j = 1; j <= 100; j++) { // 1 ~ 100 생성
			int count = 0; //소수 체크용 카운트
			
			for (int i = 1; i <= j; i++) {
				if(j % i == 0) { // 나누어지는지 확인
					count++;
				}
			}
			
			if(count == 2) { // 1과 자기자신으로만 나누어진 경우
				System.out.print(j + " ");
			}
		} // 처음 for end
		
		System.out.println();
		// 구구단 2 ~ 9 단 출력
		for(int a = 2; a <= 9; a++) {
			System.out.println(a +"단:");
			for(int b = 1; b <= 9; b++) {
				System.out.println(a + " * " + b + " = " + a * b);
			} 
		}
		
	} // main end

} // class end
