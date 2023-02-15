package 배열복습;

import javax.swing.JOptionPane;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		String[][] s = { { "", "", "" }, { "", "", "" }, { "", "", "" } };

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				s[i][j] = JOptionPane.showInputDialog("하고싶은 것 입력");
			}
		}
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.print(s[i][j] + ", ");
			}
			System.out.println();
		}
		
		
	}
}
