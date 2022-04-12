
public class Test07 {

	public static void main(String[] args) {
		// 연습
		int a = 7;
		System.out.println((float)a);
		System.out.println(Integer.toString(a) + 1);
		System.out.println(Integer.parseInt("7") + 1);
		
		String s = "Hello World!!";
		
		// +는 문자열을 이어준다.
		System.out.println(s + "!!");
		
		// length() : 문자열의 길이
		System.out.println(s.length());
		
		// substring(값) : 문자열 인덱스가 값이상부터 자른다.
		// substring(값1, 값2) : 문자열 인덱스가 값1이상부터 값2미만까지 자른다. 
		System.out.println(s.substring(3));
		System.out.println(s.substring(7, 10));
		
		//replace(값1, 값2) : 값1을 값2로 바꾼다.
		//replaceAll(값1, 값2) : 값1을 값2로 바꾼다.
		//replaceFirst(값1, 값2) : 값1을 값2로 첫번째 것만 바꾼다.
		//replace("값1", "") : 특정 값을 지운다.
		System.out.println(s.replace("l", "k"));
		System.out.println(s.replaceAll("l", ""));
		System.out.println(s.replaceFirst("l", "k"));
		
		// indexOf(값) : 값의 인덱스 위치를 찾겠다. 없는경우 -1
		// indexOf(값, 숫자) : 인덱스 중 숫자 이상에서 값의 인덱스 위치를 찾겠다.
		System.out.println(s.indexOf("x")); 
		System.out.println(s.indexOf("l", 3));
		
		// lastIndexOf(값) : 값의 인덱스 위치를 뒤에서부터 찾겠다. 없는경우 -1
		// lastIndexOf(값, 숫자) : 인덱스 중 숫자 이하에서 값의 인덱스 위치를 찾겠다.
		System.out.println(s.lastIndexOf("l"));
		System.out.println(s.lastIndexOf("l", 3));
		
		// charAt(숫자) : 인덱스 중 숫자에 해당하는 글자를 가져온다.
		System.out.println(s.charAt(6));
		
		// equals(값) : 값과 동일한지 여부를 제공
		System.out.println(s.equals("Hello?")); // 문자열을 비교할때 equals() 사용
		
		// toLowerCase() : 소문자화
		// toUpperCase() : 대문자화
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		s = "     Hello!!    ABC!!    ";
		System.out.println(s);
		// trim() : 앞뒤 공백 제거
		System.out.println(s.trim());

		
		
	} // main
 
} // class
