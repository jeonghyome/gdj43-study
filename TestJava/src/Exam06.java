import java.util.Arrays;

public class Exam06 {

	public static void main(String[] args) {
		// 로또번호 생성 5줄 출력하기
		// 1 ~ 45 까지 중복 없이 숫자 6개 * 5
		// 1 2 3 4 5 6
		int[] arr = new int[3];
			for(int j = 0; j < 3; j++) {
				arr[j] = (int)Math.floor(Math.random() * 9) + 1; // 랜덤값
				for(int k = 0; k < j; k++) {
					if(arr[j] == arr[k]) { 
						j--;
						break;
					}
				}
			}
			for(int k = 0; k < 3; k++) {
				System.out.print(arr[k]);
			}
	}
}
