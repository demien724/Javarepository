package 자바db연결;

import java.util.Scanner;

public class 회원가입2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 각 변수에 String에 값을 입력해 저장
		System.out.println("아이디 입력 >> ");
		String id = sc.next();
		
		System.out.println("패스워드 입력 >> ");
		String pw = sc.next();

		System.out.println("이름 입력 >> ");
		String name = sc.next();

		System.out.println("전화번호 입력 >> ");
		String tel = sc.next();
		
		MemberDAO2 dao = new MemberDAO2();
		dao.insert(id, pw, name, tel);
		
	}

}
