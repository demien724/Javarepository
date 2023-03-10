package 화면db연결;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class StartUI {

	public static void main(String[] args) {
		int result = 0;
		
		
		
		
		

		String id = JOptionPane.showInputDialog("아이디를 입력하세요"); // ID
		String pw = JOptionPane.showInputDialog("패스워드를 입력하세요"); // PassWord

		login loginProcess = new login();
		result = loginProcess.name(id, pw);

		if (result == 1) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
			BbsUI2 bbs = new BbsUI2();
			bbs.openBBS();
		} else {
			JOptionPane.showMessageDialog(null, "로그인 실패");
		}

	}

}
