package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 정답맞추기게임 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 투표시스템
		System.out.println("인기투표 시스템");
		System.out.println("===========");
		
		int first = 0;		// 아이유
		int second = 0;	// 방탄
		int third = 0;		// 뉴진스
		
		int vote = 0;		// 투표 번호
		
		
		while(vote != 4) {				// 괄호안의 조건이 true이면 계속 실행한다.
			System.out.print("1) 아이유 2) 방탄 3)뉴진스 4)종료 >> ");
			vote = sc.nextInt();
				
			switch (vote) {			// 
			case 1:
				first = first +1;
				break;
			case 2:
				second = second +1;
				break;
			case 3:
				third = third+1;
				break;
			case 4:
				System.out.println("투표를 종료합니다");
				break;
			default:
				System.err.println("잘못된 값을 입력하셨습니다.");
				break;
			}
		}
		
		System.out.println("--------------");
		System.out.println("아이유 " + first + "표");
		System.out.println("방탄 " + second + "표");
		System.out.println("뉴진스 " + third + "표");
		System.out.println("--------------");

	}
}
