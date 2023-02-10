package 복습;

public class 조건문 {

	public static void main(String[] args) {
		int target = 77;	// 숫자맞추기
		int answer = 88;	// 내가 시도한 값
		
//		IF문
//		1. 조건문의 조건은 무조건 TRUE / FALSE 값인 논리형 결과가 와야합니다.
//		2. IF문은 자체적으로 break를 갖고있어서 조건에 부합하는 경우(true인 경우) 조건에 따른 처리를 한 후 종료됨
		if (target == answer) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
		
//		SWTICH문
//		1. SWITCH문은 자체 break가 없음
//		2. break가 없으면 계속해서 조건을 비교함
		String target2 = "로또";
		switch (target2) {
		case "로또":
			System.out.println("정답입니다.");
			break;
		case "신나": case "놀자": case "나가자" :
			System.out.println("오답입니다.");
		default:	// 위의 조건이 다 아닐때 실행하고 싶은 내용이 있으면 default를 넣어줌
					// 생략 가능
			System.out.println("그만해");
			break;
		}
		
	}

}
