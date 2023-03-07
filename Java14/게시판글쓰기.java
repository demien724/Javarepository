package 자바db연결;

import java.util.Scanner;

public class 게시판글쓰기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 각 변수에 String에 값을 입력해 저장
		System.out.print("글 번호 입력 >> ");
		int num = sc.nextInt();

		sc.nextLine();
		System.out.print("제목 입력 >> ");
		String title = sc.nextLine();

		System.out.print("내용 입력 >> ");
		String content = sc.nextLine();
		
		System.out.print("글쓴이 입력 >> ");
		String writer = sc.next();
		
		BBSDAO dao = new BBSDAO();
		
		dao.insert(num, title, content, writer);
	}

}
