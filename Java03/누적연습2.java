package 반복문;

import javax.swing.JOptionPane;

public class 누적연습2 {

	public static void main(String[] args) {
		// 1. 숫자 누적
		// 5부터 300까지 5의 배수만 모두 더해서 출력해보세요.
		int sum1 = 0;
		for (int i = 1; i <= 300; i++) {
			if (i % 5 == 0) {
				sum1 = sum1 + i;
			}
		}
		System.out.println("합계는 " + sum1);
		
		
		
		// 2. 문자 누적
		String sum2 = "";
		for (int i = 1; i <= 4; i++) {
			String data = JOptionPane.showInputDialog("먹고싶은 음식을 입력하세요");
			sum2 = sum2 + data + " ";
		}
		System.out.println(sum2);
	}
}
