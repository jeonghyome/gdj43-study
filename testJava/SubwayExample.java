import java.util.Scanner;

public class SubwayExample {

	public static void main(String[] args) {
		String[] station = { "장승백이", "연신내", "강남", "양재", "평택" };
		int now = 0;
		int[][] trail = { { -1, -1, -1, -1 }, { -1, -1, -1, -1 }
						, { -1, -1, -1, -1 }, { -1, -1, -1, -1 } };
		int pos = -1;
		Scanner sc = new Scanner(System.in);

		System.out.println("지하철에 오신것을 환영합니다.");

		while (true) {
			System.out.println("=================================");
			System.out.println("현재역은 " + station[now] + "입니다.");
			System.out.println("=================================");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.이동 2.탑승 3.상태보기 9.종료");

			String input = sc.nextLine(); // 메뉴 선택 입력

			// 1입력하면
			if (input.equals("1")) {
				if (now == station.length - 1 || now == 0) { // 4 or 0
					pos *= -1; // 방향 전환
				}

				now += pos; // 역 위치 1씩 증가

				int cnt = 0; // 체크 카운트
				// 하차
				for (int i = 0; i < trail.length; i++) { // 열차 수 만큼 반복
					for (int j = 0; j < trail[i].length; j++) { // 열차 안에 칸만큼 반복
						if (trail[i][j] == now) { // 열차 안에 칸이 가지고있는 목적지와 현재역과 같으면
							cnt++; // 체크 카운트 1 증가
							trail[i][j] = -1; // 열차 안에 칸이 갖고 있던 목적지 초기화
						} // if문 끝
					} // 안 for문 끝
				} // 밖 for문 끝

				// 체크 카운트가 1이상 이면
				if (cnt > 0) {
					System.out.println(cnt + "명이 하차하였습니다."); // 체크 카운트 수만큼 하차
				}
				// 2입력하면
			} else if (input.equals("2")) {
				int imp = 0; // 불가능 체크
				System.out.println("---- 탑승가능 현황 ----");

				for (int i = 0; i < trail.length; i++) { // 열차 수 만큼 반복
					System.out.print((i + 1) + "호차 : "); // 1호차 ~ 4호차 까지 출력
					int cnt = 0; // 체크 카운트

					for (int target : trail[i]) { // 열차 수 마다 칸이 비였는지 확인
						if (target == -1) { // 칸이 비여있다면
							cnt++; // 체크 카운트 1 증가
						} // if문 끝
					} // for문 끝

					if (cnt > 0) { // 체크 카운트가 1이상 이면
						System.out.println("가능"); // 탑승 가능
					} else { // 체크 카운트가 0 이면
						System.out.println("불가능"); // 탑승 불가능
						imp++; // 불가능 체크 1 증가
					}
				}

				if (imp == trail.length) { // 불가능 체크가 열차 수와 같다면
					System.out.println("탑승가능 열차가 없습니다."); // 탑승할 열차가 없음
				} else { // 열차가 하나라도 있다면
					System.out.println("어느 열차에 탑승하시겠습니까?"); // 비여있는 열차 선택

					for (int i = 0; i < trail.length; i++) { // 열차 수 만큼 반복
						System.out.print((i + 1) + "." + (i + 1) + "호차 "); // 1.1호차 ~ 4.4호차 까지 출력
					}
					System.out.println(); // 한줄 띄움

					input = sc.nextLine(); // 열차 입력
					int t = Integer.parseInt(input) - 1; // 입력한 숫자에 - 1 을 함
					int cnt = 0; // 체크 카운트

					for (int target : trail[t]) { // 선택한 열차안에 칸을 하나씩 꺼냄
						if (target == -1) { // 선택한 열차안에 칸이 비여잇다면
							cnt++; // 체크 카운트 1 증가
						} // if문 끝
					} // for문 끝

					if (cnt > 0) { // 체크 카운트가 1이상 이면
						System.out.println("목적지를 선택해 주세요.");
						for (int i = 0; i < station.length; i++) { // 역 개수 만큼 출력
							if (now != i) { // 현재역과 동일하지 않다면
								System.out.print((i + 1) + "." + station[i] + " "); // 현재역을 제외하고 출력
							}
						}

						System.out.println(); // 한줄 띄움
						String input2 = sc.nextLine(); // 목적지 입력
						int s = Integer.parseInt(input2) - 1; // 입력한 숫자에 - 1 을 함

						if (s == now) { // 입력한 숫자와 현재역 숫자가 같으면
							System.out.println("목적지로 현재역은 안됩니다."); // 현재역과 목적지가 같다고 출력
						} else { // 입력한 숫자와 현재역 숫자가 다르면
							for (int i = 0; i < trail[t].length; i++) { // 열차 안 칸 갯수만큼 실행
								if (trail[t][i] == -1) { // 선택한 열차 안에 칸이 비여있으면
									trail[t][i] = s; // 입력한 목적지 저장
									break; // 저장 후 for문 나감
								} // 안 if문 끝
							} // for문 끝
						} // 밖 if문 끝

					} else { // 체크 카운트가 0이면
						System.out.println("탑승이 불가능합니다."); // 열차 안에 칸이 부족해서 탑승 불가
					}

				}
				// 3입력하면
			} else if (input.equals("3")) {
				System.out.println("---- 열차 현황 ----");

				for (int i = 0; i < trail.length; i++) { // 열차 수만큼 반복
					System.out.print((i + 1) + "호차 : "); // 1호차 : ~ 4호차 : 출력
					for (int j : trail[i]) { // 열차 안에 칸을 하나씩 꺼냄
						if (j > -1) { // 열차안 칸에 목적지가 저장되어있으면
							System.out.print("[" + station[j] + "]"); // 1호차 : ~ 4호차 : 목적지 출력
						}
					}
					System.out.println(); // 한줄 띄움
				}
			} else if (input.equals("9")) {
				System.out.println("운행을 종료합니다.");
				break;
			}

		}
	}

}
