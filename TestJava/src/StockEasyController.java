public class StockEasyController {

	public static void main(String[] args) {
		StockEasyService ses = new StockEasyService();
		
		System.out.println("*******************");
		System.out.println("*    모 의 주 식    *");
		System.out.println("*******************");
		
		ses.run();
	}

}
