package 자바db연결;

import java.util.Scanner;

public class 회원정보수정 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 각 변수에 String에 값을 입력해 저장
		System.out.println("수정할 아이디 입력 >> ");
		String id = sc.next();
		
		System.out.println("수정할 번호 입력 >> ");
		String tel = sc.next();
			
		
		MemberDAO2 dao = new MemberDAO2();
		dao.update(tel, id);
		
		
	}

}
