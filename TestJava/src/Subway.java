import java.util.Scanner;

public class Subway {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] station = { "장승백이", "연신내", "강남", "양재", "평택" }; // 지하철 역
		int now = 0; // 현재 역위치
		int pos = 1; // 이동할 숫자
		int[][] trail = { { -1, -1, -1, -1 }, { -1, -1, -1, -1 }
						, { -1, -1, -1, -1 }, { -1, -1, -1, -1 } }; // 기차 4칸 정원 4명																											

		while (true) {
			System.out.println("=========================");
			System.out.println("현재역은 [" + station[now] + "] 입니다.");
			System.out.println("=========================");
			System.out.println("메뉴를 선택해 주세요.");
			System.out.println("1.이동 2.탑승 3.상태보기 9.종료");
			String input = sc.nextLine();
			// -----------------------------이동-----------------------------------------
			if (input.equals("1")) { // 1.이동 선택시 
				now += pos; // 역위치 1 증가
				if (now == station.length - 1 || now == 0) { // 4 or 0 이 되면
					pos *= -1; // 방향 전환
				}
				// 카운트
				int cnt = 0;
				// 하차
				for (int i = 0; i < trail.length; i++) { // 총 열차 갯수만큼 반복
					for (int j = 0; j < trail[i].length; j++) { // 한 열차 칸 만큼 반복
						// 목적지와 현재역이 같으면 
						if (trail[i][j] == now) {
							// 카운트 증가
							cnt++;
							trail[i][j] = -1; // 하차 후 빈열차 칸으로 변경
						} // if 끝
					} // 안 for
				} // 밖 for
				if(cnt > 0) {
					System.out.println(cnt + "명이 하차하였습니다.");
				}
			// -----------------------------탑승-----------------------------------------
			} else if (input.equals("2")) { // 2.탑승 선택
				int imp = 0; // 불가능 체크
				
				for (int i = 0; i < trail.length; i++) { // 열차 갯수만큼 반복
					System.out.print((i + 1) + "." + (i + 1) + "호차: "); // 열차 선택 안내
					
					int cnt = 0; // 카운트					
					for (int target : trail[i]) {						
						if (target == -1) { // 빈 열차 카운트
							cnt++; // 빈열차가 있으면 카운트 증가
						}
					} // 안 for문
					if(cnt > 0) { // 체크 카운트가 1이상 이면
						System.out.println("가능"); // 탑승 가능
					} else { // 체크 카운트가 0 이면
						System.out.println("불가능"); // 탑승 불가능
						imp++; // 불가능 체크 1 증가
					}				
				} // 밖 for문 끝
				
				if(imp == trail.length) {
					System.out.println("탑승 가능한 열차가 없습니다.");
				} else {
				System.out.println("어느 열차에 탑승하시겠습니까?");
				// 열차 선택 입력
				for(int i = 0 ; i < trail.length ; i++) { // 열차 수 만큼 반복
					System.out.print((i + 1) + "." + (i + 1) + "호차 "); // 1.1호차 ~ 4.4호차 까지 출력
				}
				System.out.println(); // 한줄 띄움
				input = sc.nextLine(); // 열차 입력
				int t = Integer.parseInt(input) - 1; // 입력값(1) - 1 = 0
				int cnt = 0; // 체크 카운트
				
				for(int target : trail[t]) { // 선택한 열차안에 칸을 하나씩 꺼냄
					if(target == -1) { // 선택한 열차안에 칸이 비여잇다면
						cnt++; // 체크 카운트 1 증가
					} // if문 끝
				} // for문 끝
			
				// 빈열차가 있으면
				if (cnt > 0) {
					System.out.println("목적지를 선택해 주세요.");
					for (int i = 0; i < station.length; i++) {
						// 목적지와 현재역이 다르면
						if (now != i) {
							System.out.print((i + 1) + "." + station[i] + " "); // 역이름 출력
						}
					}
					System.out.println();
					// 목적지 입력
					String input2 = sc.nextLine(); // 목적지 입력
					int s = Integer.parseInt(input2) - 1; // 입력값 - 1
					// 목적지와 현재역이 같으면
					if (s == now) {
						System.out.println("목적지로 현재역은 안됩니다."); // 현재역위치와 목적지가 같을시
					} else {
						for (int i = 0; i < trail[t].length; i++) {
							if (trail[t][i] == -1) { // 선택한 열차 칸이 비여있을시
								trail[t][i] = s; // 목적지 저장
								break; // 저장후 for문 밖으로 나감
							}
						}
					}
					// 빈열차가 없을시
				} else {
					System.out.println("탑승이 불가능합니다.");
				}
			}
			// -----------------------------상태-----------------------------------------
			} else if (input.equals("3")) { // 3.상태보기
				System.out.println("---- 열차 현황 ----");

				for (int i = 0; i < trail.length; i++) { //열차 갯수만큼
					System.out.print((i + 1) + "호차 : "); // 열차 갯수 표시
					for (int j : trail[i]) { // 열차 안에 탑승햇는지 확인
						if (j > -1) { // 탑승 하였으면
							System.out.print("[" + station[j] + "]"); // 목적지 출력
						} // if 끝
					} // 안 for
					System.out.println();
				} // 밖 for
			// -----------------------------종료-----------------------------------------
			} else if (input.equals("9")) {
				System.out.println("종료합니다.");
				break;
			}
		}

	} // main

} // class
