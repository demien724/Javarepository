package 자바db연결;

import java.util.Scanner;

public class 게시판삭제하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 각 변수에 String에 값을 입력해 저장
		System.out.println("삭제하고 싶은 글 번호 입력 >> ");
		int num = sc.nextInt();
		
		
		BBSDAO dao = new BBSDAO();
		dao.delete(num);
	}

}

