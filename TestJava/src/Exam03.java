
public class Exam03 {

	public static void main(String[] args) {
		// 선언(건들지 말 것)
		int[] arr = {5, 7, 3}; // 0 1 2 
		
		// 오름차순 정렬
		//hint : if만으로 선 구현 후 규칙을 찾아서 for문 활용
		//hint2 : for문 구현 시 for * 2, if * 1
		//hint3 : for문 구현 시 if만으로 구현했던 내용의 index에서 규칙을 찾을 것
		
		int temp = 0;
		
		if(arr[0] > arr[1]) {
			temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}
		if(arr[0] > arr[2]) {
			temp = arr[0];
			arr[0] = arr[2];
			arr[2] = temp;
		}
		if(arr[1] > arr[2]) {
			temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} // if문
			} // 안 for문 
		}// 밖 for문
		
		// 출력(건들지 말 것)
		for(int a : arr) {
			System.out.println(a);
		} // for문
		
	}

}
