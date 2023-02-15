	package 배열복습;

public class 스트링과배열2 {

	public static void main(String[] args) {
		String s = "감자,고구마,양파";
		
		// 스트링에 들어있는 문자열을 분리시키고 싶을 때 >> split(기준)
		// 결과값은 배열입니다.
		String[] s1  = s.split(",");
		
		System.out.println(s1.length);
		System.out.println(s1[0]);
		
		String ss = "감자 고구마 양파";
		String[] ss1 = ss.split(" ");
		System.out.println(ss1[2]);
		
		// 공백을 자르기
		String s3 = "     홍길동";
		System.out.println(s3.trim());
		String s4 = s3.trim();
		
		System.out.println(s4.length());
		
	}

}
