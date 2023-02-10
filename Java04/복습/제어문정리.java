package 복습;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 제어문정리 {
	public static void main(String[] args) {
//		Scanner사용해주세요.!
//		1.id와 pw를 입력해서 id가 root이고, pw가 1234이면 로그인 성공!
//		  아니면 로그인 실패!
//		  ==> String은 ==비교 불가능. equals() 비교해야함.

		Scanner sc = new Scanner(System.in);

		System.out.print("아이디를 입력하세요 >> ");
		String id = sc.next();

		System.out.print("비밀번호를 입력하세요 >> ");
		String pw = sc.next();
		

		if (id.equals("root") && pw.equals("1234")) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
		} else {
			JOptionPane.showMessageDialog(null, "로그인 실패");
		}

//		2. 사과 구매 갯수, 사과 한 개당 가격입력
//		   딸기 구매 갯수, 딸기 한 개당 가격입력
//		   다음과 같이 출력
//		   사과 구매 가격은 5500원입니다.
//		   딸 구매 가격은 4500원입니다.
//		   전체 구매 가격은 10000원입니다.

		System.out.print("사과 구매 갯수 >>");
		int appleCount = sc.nextInt();
		System.out.print("사과 구매 가격 >>");
		int applePrice = sc.nextInt();
		System.out.print("딸기 구매 갯수 >>");
		int berryCount = sc.nextInt();
		System.out.print("딸기 구매 가격 >>");
		int berryPrice = sc.nextInt();

		int appleTotal = appleCount * applePrice;
		int berryTotal = berryCount * berryPrice;
		int total = appleTotal + berryTotal;

		System.out.println("사과 구매 금액은 " + appleTotal + "원");
		System.out.println("딸기 구매 금액은 " + berryTotal + "원");
		System.out.println("전체 구매 금액은 " + total + "원");

		// 3. 심화문제
//		   - 시작값, 종료값 입력
//		   시작값부터 종료값까지 모두 더해서 출력
		
		System.out.print("시작값 >> ");
		int start = sc.nextInt();
		System.out.print("종료값 >> ");
		int end = sc.nextInt();
		
		int result = 0;
		for (int i = start; i < end; i++) {
			result = result + i;
		}
		System.out.println("총 합은 " + result );
		
//		4. 심화문제
//		   - 시작값, 종료값, 점프값 입력
//		     시작값부터 종료값까지 점프값만큼 증가하면서 더함. 더한 값을 출력
//		     더한 값이 100을 넘으면 프로그램 종료
		System.out.print("시작값 >> ");
		int start2 = sc.nextInt();
		System.out.print("종료값 >> ");
		int end2 = sc.nextInt();
		System.out.print("점프값 >> ");
		int jump = sc.nextInt();
		
		int result2 =0;
		for (int i = start2; i < end2; i= i+jump) {
			result2 = result2+i;
			if(result2 >= 100) {
				System.exit(0);
			}
		}
		System.out.println("최종 더한 값은 " + result2);
		
		
		
		sc.close();
		
		
	}
}
