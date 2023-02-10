package 조건문;

import javax.swing.JOptionPane;

public class 설문조사10명2 {

	public static void main(String[] args) {
//		10명에게 배부른지를 설문조사
//		배부른 사람, 안 배부른 사람으로 나뉨

		int full = 0;
		int notFull = 0;

		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("배부른 사람은 1) 배부름 2) 안배부름");
			if (data.equals("1")) {
				full += 1;
//				full++;
//				full = full +1;
			} else if (data.equals("2")) {
				notFull += 1;
			} else {
				i--;
				System.out.println("Error");
			}
		}

		System.out.println("배부른 사람 " + full + "명");
		System.out.println("배부르지 않은 사람 " + notFull + "명2");
	}

}
