package 조건문;

import java.util.Scanner;

public class 심화문제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작값을 입력하세요 : ");
		int startNum = sc.nextInt();
		
		System.out.print("종료값을 입력하세요 : ");
		int endNum = sc.nextInt();
		
		int result = 0;
		for (int i = startNum; i <= endNum; i++) {
			result = result + i;
		}
		
		System.out.println("합계는 " + result);
		sc.close();
	}

}
