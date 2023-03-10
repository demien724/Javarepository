package 자바db연결;

import java.util.Scanner;

import javax.swing.JOptionPane;

import 화면db연결.MemberVO;

public class 회원1명검색 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 각 변수에 String에 값을 입력해 저장
		System.out.println("검색할 ID를 입력하세요 >> ");

		String id = sc.next();

		MemberDAO3 dao = new MemberDAO3();
		MemberVO bag = dao.one(id);
		
		String total = bag.getId()+ " ," + bag.getPw() +  " , " + bag.getTel() + " , " + bag.getName();
		
		JOptionPane.showMessageDialog(null, total);
	}

}
