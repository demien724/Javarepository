package 반복문;

public class For1 {

	public static void main(String[] args) {

		//		비교 >> 처리 >> 증가 >> 비교... 순으로 처리
		//		for( 초기값; 	조건식; 		증감식)
		//		1. 조건식 확인
		//		2. True 조건식의 결과가 True일 경우 for문 내 문장 실행
		//		2. 증감식 실행
		//		4. 다시 조건식 확인, 반복
		//		5. 비교문이 FLASE일 경우 반복문 종료
		
//		3번 반복
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "내가 반복 1");
		}

//		100번 반복
		for (int i = 0; i < 100; i++) {
			System.out.println("내가 반복 2");
		}
		
//		10번 반복
		for (int i = 0; i < 10; i++) {
			System.out.println("내가 반복 3" + 	(i+1) + "번째 실행중");
		}
	}

}
