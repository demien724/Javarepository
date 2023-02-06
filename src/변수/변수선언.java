package 변수;

public class 변수선언 {

	public static void main(String[] args) {
//		 JAVA는 변수를 만들 때, 어떤 타입의 데이터를 사용할지
//		미리 선언을 한 후에 사용한다.

		int num = 100; // 정수 변수
		double num2 = 22.2; // 실수 변수( 22.023 ), 정수 변수도 넣을 수 있습니다.
		char c = 'A'; // 글자 하나만 넣을 때 사용
		boolean b = true; // true, false (참 혹은 거짓
		
		num = 200;
		
		System.out.println("정수값은 " + num);
		System.out.println("실수값은 " + num2);
		System.out.println("문자 1개 값은 " + c);
		System.out.println("부울렌 값은 " + b);
		
	}

}
