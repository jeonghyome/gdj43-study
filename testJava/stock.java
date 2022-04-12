import java.util.Scanner;

public class stock {

	public static void main(String[] args) {
		int day = 1; // 날짜
		double[] p = new double[3]; // 등락률
		int money = 500; // 보유 자산
		int[] stock = { 100, 80, 150 }; // 주식 금액
		int[] get = new int[3]; // 주식 보유 개수
		int[] stockmoney = new int[3]; // 주식 자산
		
		Scanner sc = new Scanner(System.in);
		System.out.println("모 의 주 식");

		while (true) {
			System.out.println("-------------------------");
			System.out.println(day + "일 시세. 보유금 :" + money + "원");
			System.out.println("-------------------------");
			System.out.println("종목명	금액	등락률");
			System.out.println("-------------------------");
			System.out.println("샘성	" + stock[0] + "	" + p[0] + "%");
			System.out.println("까까오	" + stock[1] + "	" + p[1] + "%");
			System.out.println("웹플릭스	" + stock[2] + "	" + p[2] + "%");
			System.out.println("-------------------------");
			System.out.println("메뉴를 입력하여 주세요.");
			System.out.println("1.구매 2.판매 3.다음날 4.보유주식 9.종료");

			String input = sc.nextLine();

			if (input.equals("1")) {
				System.out.println("-------------------------");
				System.out.println(day + "일 시세. 보유금 :" + money + "원");
				System.out.println("-------------------------");
				System.out.println("번호	종목명	금액	보유수량");
				System.out.println("-------------------------");
				System.out.println("1	" + "샘성	" + stock[0] + "	" + get[0] + "주");
				System.out.println("2	" + "까까오	" + stock[1] + "	" + get[1] + "주");
				System.out.println("3	" + "웹플릭스	" + stock[2] + "	" + get[2] + "주");
				System.out.println("-------------------------");
				System.out.println("구매하고자 하는 종목의 번호를 입력하세요.[종료:9]");

				input = sc.nextLine();
				int t = Integer.parseInt(input);

				if (t == 1) {
					System.out.println("몇주 구입하시겠습니까?");
					String input2 = sc.nextLine();
					int t2 = Integer.parseInt(input2);
					if (money < (t2 * (stock[0] + (stock[0] * 0.01)))) {
						System.out.println("금액이 부족합니다.");
					} else {
						for (int i = 0; i < t2; i++) {
							money -= stock[0] + (stock[0] * 0.01);
							stockmoney[0] += stock[0] - (stock[0] * 0.01);
							get[0]++;
						}
					}
				} else if (t == 2) {
					System.out.println("몇주 구입하시겠습니까?");
					String input2 = sc.nextLine();
					int t2 = Integer.parseInt(input2);
					if (money < (t2 * (stock[1] + (stock[1] * 0.01)))) {
						System.out.println("금액이 부족합니다.");
					} else {
						for (int i = 0; i < t2; i++) {
							money -= stock[1] + (stock[1] * 0.01);
							stockmoney[1] += stock[1] - (stock[1] * 0.01);
							get[1]++;
						}
					}
				} else if (t == 3) {
					System.out.println("몇주 구입하시겠습니까?");
					String input2 = sc.nextLine();
					int t2 = Integer.parseInt(input2);
					if (money < (t2 * (stock[2] + (stock[2] * 0.01)))) {
						System.out.println("금액이 부족합니다.");
					} else {
						for (int i = 0; i < t2; i++) {
							money -= stock[2] + (stock[2] * 0.01);
							stockmoney[2] += stock[2] - (stock[2] * 0.01);
							get[2]++;
						}
					}
				} else if(t == 9) {
					System.out.println("모의주식 종료");
					break;
				} else {
					System.out.println("없는 종목입니다.");
				}

			} else if (input.equals("2")) {
				System.out.println("-------------------------");
				System.out.println(day + "일 시세. 보유금 :" + money + "원");
				System.out.println("-------------------------");
				System.out.println("번호	종목명	금액	보유수량");
				System.out.println("-------------------------");
				System.out.println("1	" + "샘성	" + stock[0] + "	" + get[0] + "주");
				System.out.println("2	" + "까까오	" + stock[1] + "	" + get[1] + "주");
				System.out.println("3	" + "웹플릭스	" + stock[2] + "	" + get[2] + "주");
				System.out.println("-------------------------");
				System.out.println("판매하고자 하는 종목의 번호를 입력하세요.[종료:9]");

				input = sc.nextLine();
				int t = Integer.parseInt(input);

				if (t == 1) {
					System.out.println("몇주 판매하시겠습니까?");
					String input2 = sc.nextLine();
					int t2 = Integer.parseInt(input2);
					if (t2 > get[0]) {
						System.out.println("보유 주가 부족합니다.");
					} else {
						for (int i = 0; i < t2; i++) {
							money += stock[0] - (stock[0] * 0.04);
							stockmoney[0] -= stock[0] - (stock[0] * 0.01);
							get[0]--;
						}
					}
					
				} else if (t == 2) {
					System.out.println("몇주 판매하시겠습니까?");
					String input2 = sc.nextLine();
					int t2 = Integer.parseInt(input2);
					if (t2 > get[1]) {
						System.out.println("보유 주가 부족합니다.");
					} else {
						for (int i = 0; i < t2; i++) {
							money += stock[1] - (stock[1] * 0.04);
							stockmoney[1] -= stock[1] - (stock[1] * 0.01);
							get[1]--;
						}
					}
					
				} else if (t == 3) {
					System.out.println("몇주 판매하시겠습니까?");
					String input2 = sc.nextLine();
					int t2 = Integer.parseInt(input2);
					if (t2 > get[2]) {
						System.out.println("보유 주가 부족합니다.");
					} else {
						for (int i = 0; i < t2; i++) {
							money += stock[2] - (stock[2] * 0.04);
							stockmoney[2] -= stock[2] - (stock[2] * 0.01);
							get[2]--;
						}
					}
					
				} else if(t == 9) {
					System.out.println("모의주식 종료");
					break;
				} else {
					System.out.println("없는 종목입니다.");
				}
				
			} else if (input.equals("3")) {
				day++;
				for (int i = 0; i < 3; i++) {
					p[i] = Math.random() * 5 + Math.random() * -5;// 4.99 이하 -5.99 이상
					if (p[i] > 0) {
						p[i] = Math.ceil(p[i] * 10) / 10;
					} else {
						p[i] = Math.floor(p[i] * 10) / 10;
					}
				}

				stock[0] += (stock[0] * p[0]) / 100;
				stock[1] += (stock[1] * p[1]) / 100;
				stock[2] += (stock[2] * p[2]) / 100;


			} else if(input.equals("4")) {
				System.out.println("--------------------------------------");
				System.out.println("총주식자산 : " + (stockmoney[0] + stockmoney[1] + stockmoney[2]) + "원");
				System.out.println("종목명	현재가	보유주	주식자산");
				System.out.println("--------------------------------------");
				System.out.println("샘성	" + stock[0] + "	" + get[0] + "주" + "	" + stockmoney[0]);
				System.out.println("까까오	" + stock[1] + "	" + get[1] + "주" + "	" + stockmoney[1]);
				System.out.println("웹플릭스	" + stock[2] + "	" + get[2] + "주" + "	" + stockmoney[2]);
				
			} else if (input.equals("9")) {
		
				System.out.println("모의주식 종료");
				break;
				
			} else {
				System.out.println("메뉴를 입력해주세요.");
			}
		}

	}

}
