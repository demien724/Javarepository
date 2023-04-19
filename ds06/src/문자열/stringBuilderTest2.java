package 문자열;

public class stringBuilderTest2 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Hello Wolrd");
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder();
		sb1.append("Hello Wolrd");
		
		
		
		System.out.println(sb1.capacity());	// StringBuilder의 수용 가능 크기
		System.out.println(sb1.length());	// StringBuilder의 문자 길이
		
		System.out.println(sb1.charAt(0));	// StringBuilder 문자열의 특정 인덱스
		
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1 == sb2);
		
		System.out.println(sb1.indexOf("ll"));	// 해당 문자열이 위치한 인덱스를 반환
		System.out.println(sb1.indexOf("o", 6));	// 특정 위치(인덱스)에서 부터 탐색을 시작해 해당 문자열이 위치한 인덱스를 반환
		
		System.out.println(sb1.substring(6));	// 지정한 인덱스에서 부터 문장 끝까지의 문자열을 반환
		
	}
}
