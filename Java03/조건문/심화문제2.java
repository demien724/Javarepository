package 조건문;

import java.util.Scanner;

public class 심화문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("사과 한개의 가격은? ");
		int apple = sc.nextInt();
		System.out.print("사과를 총 몇개 구입하나요? ");
		int appleNum = sc.nextInt();
		System.out.print("딸기 한개의 가격은? ");
		int strawberry = sc.nextInt();
		System.out.print("딸기를 총 몇개 구입하나요? ");
		int berryNum = sc.nextInt();

		int resultApple = apple * appleNum;
		int resultBerry = strawberry * berryNum;
		System.out.println("딸기의 구매 가격은 " + resultApple + "원 입니다.");
		System.out.println("딸기의 구매 가격은 " + resultBerry + "원 입니다.");
		System.out.println("전체 구매 가격은 " + (resultApple + resultBerry) + "원 입니다.");
		
		sc.close();

	}

}
