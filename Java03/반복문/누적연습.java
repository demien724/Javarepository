package 반복문;

import javax.swing.JOptionPane;

public class 누적연습 {

	public static void main(String[] args) {
		// 숫자 누적
		int sum = 0; // 변수의 초기화를 반드시 해주세요.
		for (int i = 1; i <= 1000; i++) {
			sum = sum + i;
		}
		System.out.println("전체 합은 >> " + sum);

		// 글자 누적
		String sum2 = "";
		for (int i = 0; i < 3; i++) {
			String data = JOptionPane.showInputDialog("가고 싶은 곳 입력");
			sum2 = sum2	+ data + " "+ " ";
		}
		System.out.println(sum2);
	}
}
