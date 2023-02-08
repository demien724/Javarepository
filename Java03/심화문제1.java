package 조건문;

import java.util.Scanner;

public class 심화문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id = sc.next();
		String pw = sc.next();
		
		if(id.equals("root") && pw.equals("pw")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패!");
		}
		
		sc.close();
	}

}
