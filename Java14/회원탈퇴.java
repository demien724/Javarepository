package 자바db연결;

import java.util.Scanner;

public class 회원탈퇴 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 각 변수에 String에 값을 입력해 저장
		System.out.println("탈퇴할 아이디 입력 >> ");
		String id = sc.next();
		
			
		
		MemberDAO2 dao = new MemberDAO2();
		dao.delete(id);
	}

}
