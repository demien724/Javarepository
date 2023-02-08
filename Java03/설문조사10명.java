package 조건문;

import javax.swing.JOptionPane;

public class 설문조사10명 {

	public static void main(String[] args) {
//		인기투표
//		10명, 1번-아이유, 2번-유재석, 3번-BTS

		int people = 10;

		int first = 0;
		int second = 0;
		int third = 0;
		
		for (int i = 0; i < people; i++) {
			String data = JOptionPane.showInputDialog("인기투표 번호를 입력하세요\n(1번 : 아이유, 2번 : 유재석, 3번 : BTS)");

			if (data.equals("1")) {
				first++;
			} else if (data.equals("2")) {
				second++;
			} else if (data.equals("3")) {
				third++;
			} else {
				JOptionPane.showMessageDialog(null, "투표를 잘못하셨습니다.");
				i--;
			}
		}

		System.out.println("1번 투표수 " + first + "명");
		System.out.println("2번 투표수 " + second + "명");
		System.out.println("3번 투표수 " + third + "명");
			
		
	}

}
