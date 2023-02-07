package 조건문;

import javax.swing.JOptionPane;

public class if문7 {
	public static void main(String[] args) {
		// 1번 문제
		String inputPasswords = JOptionPane.showInputDialog("암호를 대시오");
		String storedPasswords = "HelloWorld";

		if (inputPasswords.equals(storedPasswords)) {
			System.out.println("들어오세요");
		} else {
			System.out.println("나가세요");
		}

		// 2번 문제
		String dinner = JOptionPane.showInputDialog("당신이 먹고싶은 저녁 메뉴는?");

		switch (dinner) {
		case "자장면":
			System.out.println("중국집으로 가요");
			break;
		case "라면":
			System.out.println("분식집으로 가요");
			break;
		case "회":
			System.out.println("횟집으로 가요");
			break;
		default:
			System.out.println("그냥 안 먹어요");
			break;
		}

		//	3번 문제
		String input01 = JOptionPane.showInputDialog("첫번째 정수를 입력하세요.");
		String input02 = JOptionPane.showInputDialog("두번째 정수를 입력하세요.");

		int num01 = Integer.parseInt(input01);
		int num02 = Integer.parseInt(input02);

		if (num01 > num02) {
			System.out.println(num01 + ", 첫번째 정수가 더 큽니다");
		} else if (num01 < num02) {
			System.out.println(num02 + ", 두번째 정수가 더 큽니다.");
		} else {
			System.out.println("서로 같은 크기입니다.");
		}
		
		//4번 문제
		String no = "A100EX";
		
		char firstChar = no.charAt(0);
		
		switch (firstChar) {
		case 'A':
			System.out.println("기획부 사원");
			break;
		case 'B':
			System.out.println("총무부 사원");
			break;
		case 'C':
			System.out.println("개발부 사원");
			break;
		default:
			System.out.println("해당부서 없음");
			break;
		}
	}
}
