package 조건문;

public class if문3 {
	public static void main(String[] args) {
		// 조건이 여러개 일때

		int myNum = 88;
		// 점수가 80점 이상이면 최우수
		// 점수가 70점 이상이면 우수
		// 점수가 60점 이상이면 보통
		// 나머지는 미달
		if (myNum >= 80) {
			System.out.println("최우수");
		} else if (myNum >= 70) {
			System.out.println("우수");
		} else if (myNum >= 60) {
			System.out.println("보통");
		} else {
			System.out.println("미달");
		}
		
//		if문은 조건이 맞아서 실행되면 자동으로 끝남!
//		break를 사용하지 않음
		
		int myTour = 9;
		// 여행 횟수가 10이면 VVIP 프린트
		// 여행 횟수가 6이면 VIP 프린트
		// 나머지 횟수면 Normal 프린트
		
		switch (myTour) {
		case 10:
			System.out.println("VVIP");
			break;
		case 6:
			System.out.println("VIP");
			break;
		default: 
			System.out.println("Normal");
			break;
		}
		
//		switch문은 조건이 맞아도 다음 경우를 비교함
//		switch문 종료를 원하면 break를 활용
	}
}
