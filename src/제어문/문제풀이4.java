package 제어문;

import javax.swing.JOptionPane;

public class 문제풀이4 {

	public static void main(String[] args) {
//		입력
		String hobby = JOptionPane.showInputDialog("나의 취미는");
		String number = JOptionPane.showInputDialog("1주일 동안의 취미 활동 횟수는?");
		
//		처리 + 출력
		System.out.println("나는 취미활동으로 " + hobby + "를 " + number + "번 합니다.");
		
	}

}
