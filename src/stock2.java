import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stock2 {

	public static void main(String[] args) {
		int day = 1; // 날짜 변경값
		int today = 0; // 오전 오후 변경값
		String[] am = { "오전", "오후" };
		double[] p = new double[3]; // 등락률
		int[] buy = new int[3];// 구입 금액
		int money = 500; // 보유 금액
		int[] stockmoney = new int[3]; // 보유자산
		int[] stock = { 100, 80, 150 }; // 샘성 , 까까오, 웹플릭스
		int[] get = new int[3]; // 주식 보유 개수
		
		List<Integer> lm1 = new ArrayList<Integer>(); // 샘성 최근 금액
		List<Double> lp1 = new ArrayList<Double>(); // 샘성 최근 등락률
		
		List<Integer> lm2 = new ArrayList<Integer>(); // 까까오 최근 금액
		List<Double> lp2 = new ArrayList<Double>(); // 까까오 최근 등락률
		
		List<Integer> lm3 = new ArrayList<Integer>(); // 웹플릭스 최근 금액
		List<Double> lp3 = new ArrayList<Double>(); // 웹플릭스 최근 등락률

		Scanner sc = new Scanner(System.in);

		System.out.println("모의주식 안내");

		while (true) {
			
			System.out.println("--------------------------------------");
			System.out.println(day + "일 " + am[today] + "시세.  보유금액: " + money + "원");
			System.out.println("--------------------------------------");
			System.out.println("종목명	" + "금액	" + "등락률");
			System.out.println("--------------------------------------");
			System.out.println("샘성	" + stock[0] + "	" + p[0] + "%");
			System.out.println("까까오	" + stock[1] + "	" + p[1] + "%");
			System.out.println("웹플릭스	" + stock[2] + "	" + p[2] + "%");
			System.out.println("--------------------------------------");
			System.out.println("메뉴를 입력하여 주세요.");
			System.out.println("1.구매 2.판매 3.다음 4.주식조회 5.보유주식 9.종료");
			
			String input = sc.nextLine();
			
			if (input.equals("1")) {
				
				System.out.println("--------------------------------------");
				System.out.println(day + "일 " + am[today] + "시세.  보유금액: " + money + "원");
				System.out.println("--------------------------------------");
				System.out.println("번호	종목명	금액	보유수량");
				System.out.println("--------------------------------------");
				System.out.println("1	" + "샘성	" + stock[0] + "	" + get[0] + "주");
				System.out.println("2	" + "까까오	" + stock[1] + "	" + get[1] + "주");
				System.out.println("3	" + "웹플릭스	" + stock[2] + "	" + get[2] + "주");
				System.out.println("--------------------------------------");
				System.out.println("구매하고자 하는 종목의 번호를 입력하세요.[종료:9]");
				
				input = sc.nextLine();
				int t = Integer.parseInt(input);

				if (t == 1) {
					
					System.out.println("몇주 구입하시겠습니까?(수수료0.01%)");
					String input2 = sc.nextLine();
					int t2 = Integer.parseInt(input2);
					
					if (money < (t2 * (stock[0] + (stock[0] * 0.01)))) {
						System.out.println("금액이 부족합니다."); // 보유자산이 구매금액보다 적을시
					} else {
						for (int i = 0; i < t2; i++) { // 구매수량 만큼 반복
							money -= stock[0] + (stock[0] * 0.01); // 보유자산 에서 수수료 뺌
							stockmoney[0] += stock[0] - (stock[0] * 0.01);
							get[0]++; // 보유 수랑 증가
							buy[t-1] = stock[0]; // 구매 금액 저장
						}
						
					}
					
				} else if (t == 2) {
					System.out.println("몇주 구입하시겠습니까?(수수료0.01%)");
					String input2 = sc.nextLine();
					int t2 = Integer.parseInt(input2);
					if (money < (t2 * (stock[1] + (stock[1] * 0.01)))) {
						System.out.println("금액이 부족합니다.");
					} else {
						for (int i = 0; i < t2; i++) {
							money -= stock[1] + (stock[1] * 0.01);
							stockmoney[1] += stock[1] - (stock[1] * 0.01);
							get[1]++;
							buy[t-1] = stock[1];
						}
						
					}
					
				} else if (t == 3) {
					System.out.println("몇주 구입하시겠습니까?(수수료0.01%)");
					String input2 = sc.nextLine();
					int t2 = Integer.parseInt(input2);
					if (money < (t2 * (stock[2] + (stock[2] * 0.01)))) {
						System.out.println("금액이 부족합니다.");
					} else {
						for (int i = 0; i < t2; i++) {
							money -= stock[2] + (stock[2] * 0.01);
							stockmoney[2] += stock[2] - (stock[2] * 0.01);
							get[2]++;
							buy[t-1] = stock[2];
						}
						
					}
				} else if(t == 9) {
					System.out.println("모의주식 종료");
					break;
				} else {
					System.out.println("없는 종목입니다.");
				}
				
			} else if (input.equals("2")) {
				
				System.out.println("--------------------------------------");
				System.out.println(day + "일 " + am[today] + "시세.  보유금액: " + money + "원");
				System.out.println("--------------------------------------");
				System.out.println("번호	종목명	금액	보유수량");
				System.out.println("--------------------------------------");
				System.out.println("1	" + "샘성	" + stock[0] + "	" + get[0] + "주  ");
				System.out.println("2	" + "까까오	" + stock[1] + "	" + get[1] + "주  ");
				System.out.println("3	" + "웹플릭스	" + stock[2] + "	" + get[2] + "주  ");
				System.out.println("--------------------------------------");
				System.out.println("판매하고자 하는 종목의 번호를 입력하세요.[종료:9]");

				input = sc.nextLine();
				int t = Integer.parseInt(input);

				if (t == 1) {
					
					System.out.println("몇주 판매하시겠습니까?(수수료0.04%)");
					String input2 = sc.nextLine();
					int t2 = Integer.parseInt(input2);
					if (t2 > get[0]) { // 보유수량이 판매수량보다 적을시
						System.out.println("보유 주가 부족합니다.");
					} else {
						for (int i = 0; i < t2; i++) { // 판매수량만큼 반복
							money += stock[0] - (stock[0] * 0.04); // 보유자산에서 수수료 뺌
							stockmoney[0] -= stock[0] - (stock[0] * 0.01);
							get[0]--; // 판매수량만큼 감소
							if(get[0] == 0) { // 보유 수가 0이면
								buy[t-1] -= buy[t-1]; // 보유현황 구매금액 제거
							}
						}
						
					}
					
				} else if (t == 2) {
					
					System.out.println("몇주 판매하시겠습니까?(수수료0.04%)");
					String input2 = sc.nextLine();
					int t2 = Integer.parseInt(input2);
					if (t2 > get[1]) {
						System.out.println("보유 주가 부족합니다.");
					} else {
						for (int i = 0; i < t2; i++) {
							money += stock[1] - (stock[1] * 0.04);
							stockmoney[1] -= stock[1] - (stock[1] * 0.01);
							get[1]--;
							if(get[1] == 0) {
								buy[t-1] -= buy[t-1]; //
							}
						}
					}
					
				} else if (t == 3) {
					
					System.out.println("몇주 판매하시겠습니까?(수수료0.04%)");
					String input2 = sc.nextLine();
					int t2 = Integer.parseInt(input2);
					if (t2 > get[2]) {
						System.out.println("보유 주가 부족합니다.");
					} else {
						for (int i = 0; i < t2; i++) {
							money += stock[2] - (stock[2] * 0.04);
							stockmoney[2] -= stock[2] - (stock[2] * 0.01);
							get[2]--;
							if(get[2] == 0) {
								buy[t-1] -= buy[t-1]; //
							}
						}
					}
					
				} else if(t == 9) {
					System.out.println("모의주식 종료");
					break;
				} else {
					System.out.println("없는 종목입니다.");
				}
				
			} else if (input.equals("3")) {
				
				today++;
				if (today == 2) {
					today = 0;
					day++;
				}
				
				for (int i = 0; i < 3; i++) {
					p[i] = Math.random() * (25 * 0.1) + Math.random() * (-25 * 0.1);// +2.5미만  ~ -2.6미만
					if (p[i] > 0) {
						p[i] = Math.ceil(p[i] * 10) / 10;
					} else {
						p[i] = Math.floor(p[i] * 10) / 10;
					}
				}
				
				stock[0] += (stock[0] * p[0]) / 100;
				stock[1] += (stock[1] * p[1]) / 100;
				stock[2] += (stock[2] * p[2]) / 100;
				
				lm1.add(0, stock[0]);
				lp1.add(0, p[0]);
				lm2.add(0, stock[1]);
				lp2.add(0, p[1]);
				lm3.add(0, stock[2]);
				lp3.add(0, p[2]);

			} else if(input.equals("4")) {
				
				System.out.println("--------------------------------------");
				System.out.println("번호	" + "종목명");
				System.out.println("--------------------------------------");
				System.out.println("1	샘성");
				System.out.println("2	까까오");
				System.out.println("3	웹플릭스");
				System.out.println("--------------------------------------");
				System.out.println("종목의 번호를 입력하세요.[종료:9]");
				
				input = sc.nextLine();
				int t = Integer.parseInt(input);
				
				if(t == 1) {
					if (!lp1.isEmpty() && !lm1.isEmpty()) {
						System.out.println("--------------------------------------");
						System.out.println("최근 주식 변화(최대5건)");
						System.out.println("--------------------------------------");
						System.out.println("종목명	금액	등락률");
						System.out.println("--------------------------------------");

						for (int i = 0; i < lm1.size(); i++) {
							if (i < 5) {
								System.out.println((i + 1) + ".샘성	" + lm1.get(i) + "	" + lp1.get(i) + "%");
							} else {
								lp1.remove(5);
								lm1.remove(5);
							}
						}
					} else {
						System.out.println("변동 없음");
					}
				}
				if (t == 2) {
					if (!lp2.isEmpty() && !lm2.isEmpty()) {
						System.out.println("--------------------------------------");
						System.out.println("최근 주식 변화(최대5건)");
						System.out.println("--------------------------------------");
						System.out.println("종목명	금액	등락률");
						System.out.println("--------------------------------------");

						for (int i = 0; i < lm2.size(); i++) {
							if (i < 5) {
								System.out.println((i + 1) + ".까까오	" + lm2.get(i) + "	" + lp2.get(i) + "%");
							} else {
								lp2.remove(5);
								lm2.remove(5);
							}
						}

					} else {
						System.out.println("변동 없음");
					}
				}
				if (t == 3) {
					if (!lp3.isEmpty() && !lm3.isEmpty()) {
						System.out.println("--------------------------------------");
						System.out.println("최근 주식 변화(최대5건)");
						System.out.println("--------------------------------------");
						System.out.println("종목명	금액	등락률");
						System.out.println("--------------------------------------");

						for (int i = 0; i < lm3.size(); i++) {
							if (i < 5) {
								System.out.println((i + 1) + ".웹플릭스	" + lm3.get(i) + "	" + lp3.get(i) + "%");
							} else {
								lp3.remove(5);
								lm3.remove(5);
							}
						}

					} else {
						System.out.println("오픈 전입니다.");
					}
				}
				
			} else if(input.equals("5")) {
				System.out.println("--------------------------------------");
				System.out.println("종목명	현재가	구매금액	보유주	주식자산");
				System.out.println("--------------------------------------");
				System.out.println("샘성	" + stock[0] + "	" + buy[0] + "	" + get[0] + "주" + "	" + stockmoney[0]);
				System.out.println("까까오	" + stock[1] + "	" + buy[1] + "	" + get[1] + "주" + "	" + stockmoney[1]);
				System.out.println("웹플릭스	" + stock[2] + "	" + buy[2] + "	" + get[2] + "주" + "	" + stockmoney[2]);
			} else if (input.equals("9")) {
				System.out.println("모의주식 종료");
				break;
			}

		}

	}

}
