package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 정답맞추기게임2 {
	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100); // 맞춰야하는 값 랜덤 생성

		Scanner sc = new Scanner(System.in); // 스캐너 설정

		int count = 0; // 횟수

		while (true) {
			System.out.print("당신이 생각하는 정답은? >> ");
			int data = sc.nextInt();
			count = count +1;			// 횟수 증가
			
			if (data == target) {		// 정답인 경우
				System.out.println("정답입니다");
				System.out.println();
				System.out.println("정답 >> " + target);
				System.out.println("횟수 >> " + count);
				break;
			} else {						// 오답인 경우
				System.out.println("오답입니다");

				if (data < target) {
					System.out.println("적으신 값이 작습니다");
				} else if (data > target) {
					System.out.println("적으신 값이 큽니다");
				}
				System.out.println();
			}
		}

		sc.close();
	}
}
