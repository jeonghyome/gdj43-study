
public class Test09 {

	public static void main(String[] args) {
		int[][] arr = {{1, 3, 5}, 
						{2, 4, 6}};
		
		System.out.println(arr.length); // 처음 방 개수
		System.out.println(arr[0].length); // 처음방이0이고 2번 방 개수
		
		System.out.println(arr[0]);
		System.out.println(arr[0][2]); // 5
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			} // 안 for문
			System.out.println();
		} // 밖 for문
		
	} 

}
