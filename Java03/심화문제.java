package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 심화문제 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		FlowLayout flow = new FlowLayout();
		
		JLabel label1 = new JLabel();	// 아이디
		JLabel label2 = new JLabel();	// 비밀번호
		JLabel label3 = new JLabel();	// 결과
		
		JTextField text1 = new JTextField();	// 아이디	입력	
		JTextField text2 = new JTextField();	// 비밀번호	입력
		
		JButton button1 = new JButton();	// 로그인
		JButton button2 = new JButton();	// 지우기
		
		// 처리
		frame.setSize(300,450);
		frame.setLayout(flow);
		
		
		// 출력
		frame.setVisible(true);
		
	}

}
