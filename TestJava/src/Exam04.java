
public class Exam04 {

	public static void main(String[] args) {
		/*
		String val = "1"; //대상
		String res = ""; // 결과 문자열
		String check = ""; // 숫자
		int cnt = 0; // 개수
		System.out.println(val); // 첫줄 실행
		for(int i = 0; i < 9; i++) { // 회수
			res = ""; // 초기화
			check = val.substring(0,1); // 0번째 숫자 설정
			cnt = 1; // 개수 1 초기화;
			for(int j = 1; j < val.length(); j++) { // 1 ~ 마지막
				if(check.equals(val.substring(j, j + 1))) { // j이상 j+1미만
					cnt++; // 개수 증가
				} else { // 다를 때
					res += check + cnt; // 문자열누적
					check = val.substring(j, j + 1); // 숫자 변경
					cnt = 1; // 개수 1
				}
			}
			res += check + cnt; // 문자열 누적
			val = res; // 현재 결과값이 다음 대상이 됨
			System.out.println(res);
		}
		*/
		
		/*
		String val = "1";
		String res = "";
		int pos = 0; // 인덱스 번호
		System.out.println(val); // 첫행 출력
		for(int i = 0; i < 9; i++) {
			res = ""; // 초기화
			pos = 0; // 초기화
			for(int j = 1; j < val.length(); j++) {
				if(val.charAt(pos) != val.charAt(j)) {
					res = res + val.charAt(pos) + (j - pos); 
					pos = j; // 인덱스 자리 옮김
				}
			}
			res = res + val.charAt(pos) + (val.length() - pos);
			val = res; // 다음 대상
			System.out.println(res); //출력
		}
		*/
		
		String val = "1"; // 대상
		String res = ""; // 문자열
		int pos = 0; // 인덱스 번호
		System.out.println(val); // 첫 행 출력 
		for(int i = 0; i < 9; i++) { // 9행
			String[] vals = val.split(""); // 배열 생성
			res = ""; // 초기화
			pos = 0; // 인덱스 번호 초기화
			for(int j = 1; j < val.length(); j++) {
				if(!vals[pos].equals(vals[j])) { // 다를때
					res += vals[pos] + (j - pos); // 계산 후 누적
					pos = j; // 인덱스 교체
				}
			}
		res += vals[pos] + (val.length() - pos); // 계산 후 누적
		val = res; // 결과값을 다음 대상으로 변경
		System.out.println(res); // 출력
		}
		
	}

} 