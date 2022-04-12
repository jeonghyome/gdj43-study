import java.util.Scanner;

public class StockEasyService {
	
	String[] corp = {"샘성", "까까오", "웹플릭스"}; 
	int[] price = {100, 80, 150};
	float[] updown = {0, 0, 0};
	int[] stock = {0, 0, 0};
	int money = 500;
	int day = 1;
	Scanner sc = new Scanner(System.in);
	boolean rFlag = true;
	float buyP = 0.01f;
	float sellP = 0.04f;
	
	public void run() {
		while(rFlag) {
			marketShow();
			
			System.out.println("메뉴를 입력하여 주세요.");
			System.out.println("1.구매 2.판매 3.다음날 9.종료");
			
			switch(sc.nextLine()) {
			case "1" : buyStock();
				break;
			case "2" : sellStock();
				break;
			case "3" : nextTime();
				break;
			case "9" : System.out.println("종료합니다.");
						rFlag = false;
				break;
				default : System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	public void marketShow() {
		System.out.println("---------------------");
		System.out.println(day + "일 시세. 보유금 :" + money + "원");
		System.out.println("---------------------");
		System.out.println("종목명\t금액\t등락률");
		System.out.println("---------------------");
		for(int i = 0 ; i < corp.length ; i++) {
			System.out.println(corp[i] + "\t" + price[i] + "\t" + updown[i] + "%");
		}
		System.out.println("---------------------");
	}
	
	public void updown() {
		for(int i = 0 ; i < corp.length ; i++) {
			float num = ((float) Math.floor(Math.random() * 100) + -50) / 10;
			
			price[i] = (int) (price[i] + Math.round(price[i] * num / 100));
			if(price[i] < 0) {
				price[i] = 0;
			}
			updown[i] = num;
		}
	}
	
	public void nextTime() {
		day++;
		updown();
	}
	
	public void buyStock() {
		System.out.println("---------------------------");
		System.out.println(day + "일 시세. 보유금 :" + money + "원");
		System.out.println("---------------------------");
		System.out.println("번호\t종목명\t금액\t보유수량");
		System.out.println("---------------------------");
		for(int i = 0 ; i < corp.length ; i++) {
			System.out.println(i + "\t" + corp[i] + "\t" + price[i] + "\t" + stock[i] + "주");
		}
		System.out.println("--------------------------");
		System.out.println("구매하고자 하는 종목의 번호를 입력하세요.[종료: 9]");
		
		int num = Integer.parseInt(sc.nextLine());
		
		if(num >= corp.length && num != 9) {
			System.out.println("잘못입력하셨습니다.");
		} else if(num != 9) {
			if(money >= price[num] + price[num] * buyP) {
				stock[num]++;
				money -= price[num] + price[num] * buyP;
			} else {
				System.out.println("금액이 부족합니다.");
			}
		}
	}
	
	public void sellStock() {
		System.out.println("---------------------------");
		System.out.println(day + "일 시세. 보유금 :" + money + "원");
		System.out.println("---------------------------");
		System.out.println("번호\t종목명\t금액\t보유수량");
		System.out.println("---------------------------");
		for(int i = 0 ; i < corp.length ; i++) {
			System.out.println(i + "\t" + corp[i] + "\t" + price[i] + "\t" + stock[i] + "주");
		}
		System.out.println("--------------------------");
		System.out.println("판매하고자 하는 종목의 번호를 입력하세요.[종료: 9]");
		
		int num = Integer.parseInt(sc.nextLine());
		
		if(num >= corp.length && num != 9) {
			System.out.println("잘못입력하셨습니다.");
		} else if(num != 9) {
			if(stock[num] == 0) {
				System.out.println("해당주식을 보유하지 않았습니다.");
			} else {
				stock[num]--;
				money += price[num] - price[num] * sellP;
			}
		}
	}
}
