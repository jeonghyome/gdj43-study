
public class Test06 {

	public static void main(String[] args) {

		System.out.println("1번");
		// 1
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			} // 안쪽 for문
			System.out.println();
		} // 밖 for문

		System.out.println("2번");
		// 2
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 4 - i; j++) {
				System.out.print("*");
			} // 안쪽 for문
			System.out.println();
		} // 밖 for문

		System.out.println("3번");
		// 3
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j <= 3 - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				} // if 끝
			} // 안쪽 for문
			System.out.println();
		} // 밖 for문

		System.out.println("4번");
		// 4
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				} // if 끝
			} // 안쪽 for문
			System.out.println();
		} // 밖 for문

		System.out.println("5번");
		// 5
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				if (j < 4 - i || j > 4 + i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				} // if 끝
			} // 안쪽 for문
			System.out.println();
		} // 밖 for문

		System.out.println("6번");
		// 6
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				if (j < i || j >= 9 - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}// if 끝
			} // 안쪽 for문
			System.out.println();
		} // 밖 for문

		System.out.println("7번");
		// 7
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (j < 4 - i || j > i + 4 || 
						j < i - 4 || j >= 13 - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				} // if 끝
			} // 안쪽 for문
			System.out.println();
		} // 밖 for문

	} // main

}// class
