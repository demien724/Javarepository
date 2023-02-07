package 복습;

public class 자바연산시주의점 {

	public static void main(String[] args) {
//			 자바 연산시 주의점
		int x = 20;
		int y = 30;

//		정수와 정수끼리의 계산 결과는 무조건 정수
//		계산시 하나라도 실수이면 결과는 무조건 실수
		System.out.println(x / y); // 결과는 정수

		int x2 = 20;
		double y2 = 30;

		System.out.println(x2 / y2); // 결과는 실수

//		이미 정수로 저장된 값을 CPU가 가져다가
//		실수 연산을 하고싶은 경우 CPU가 정수를 실수로 변환해서 실수연산을 할 수 있음
//		타입변환을 하고 싶은 경우 해당 변수 앞에 소괄호 타입을 적어 변환을 한다
//		예시 ==> ( 변환하고 싶은 타입 ) 변수
		System.out.println( (double)x / y);

	}

}
