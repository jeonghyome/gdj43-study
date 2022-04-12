import java.util.Scanner;

public class Elevator {

	public static void main(String[] args) {
		String[] flo = { "1", "2", "3" }; // 층
		int[] elev = { -1, -1, -1, -1 }; // 정원
		int now = 0;
		int pos = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("엘레베이터 이용안내");
		while (true) {
			System.out.println("현재 " + flo[now] + "층 입니다.");
			System.out.println("1.이동 2.탑승 3.탑승상태 9.종료");

			String input = sc.nextLine();

			if (input.equals("1")) {
				now += pos; // 1층씩 이동
				if (now == flo.length - 1 || now == 0) {
					pos *= -1; // 전환
				}
				int cnt = 0;
				// 하차
				for (int i = 0; i < elev.length; i++) {
					if (elev[i] == now) {
						cnt++;
						elev[i] = -1;
					}
				}
				if (cnt > 0) {
					System.out.println(cnt + "명이 내렸습니다.");
				}

			} // 1번 끝
			else if (input.equals("2")) {
				System.out.print("탑승 가능 여부 : ");
				int cnt = 0;
				for (int i = 0; i < elev.length; i++) {
					if (elev[i] == -1) {
						cnt++;
					}
				}
				if (cnt > 0) {
					System.out.println("가능");
					System.out.println("목적지를 선택해 주세요.");
					for (int i = 0; i < flo.length; i++) {
						if (now != i) {
							System.out.print((i + 1) + "." + flo[i] + "층 ");
						}
					}
					System.out.println();
					input = sc.nextLine();
					int s = Integer.parseInt(input) - 1;
					if (s == now) {
						System.out.println("현재층입니다.");
					} else {
						for (int i = 0; i < elev.length; i++) {
							if (elev[i] == -1) {
								elev[i] = s;
								break;
							}
						}
					}
				} else {
					System.out.println("정원 초과");

				} // 2번 끝
			} else if (input.equals("3")) {
				System.out.println("탑승 현황");
				for (int j : elev) {
					if (j > -1) {
						System.out.print(flo[j] + "층 ");
					}
				}
				System.out.println(); // 한줄 띄움
			} else if (input.equals("9")) {
				System.out.println("운행을 종료합니다.");
				break;
			}

		} // while문 끝

	}

}
