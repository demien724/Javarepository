	package 배열복습;

public class 스트링과배열 {

	public static void main(String[] args) {
		// String의 일부를 추출하거나 확인할 때 
		// 쓰는 메서드를 확인
		
		String s = "나는 프로그래머야";
		String s2 = "진짜!!";
		
		System.out.println(s + s2);
		System.out.println(s.concat(s2));		// String 결합
		System.out.println(s.charAt(0));		// 해당 인덱스에 위치한 Char을 출력
		char c = s.charAt(0);
		
		System.out.println(s.endsWith("야"));
		boolean result = s.endsWith("야");
		
		String result2 = s.substring(3);		// 인덱스 3부터 문장 끝까지 추출
		String result3 = s.substring(3, 8);	// 인덱스 3부터 인덱스 7까지 추출
		
		boolean result4 = s.contains(s2);
		int index = s.lastIndexOf("프");
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		s = s.replace("나","너");				// 비파괴함수
		System.out.println(s);
		
	}

}
