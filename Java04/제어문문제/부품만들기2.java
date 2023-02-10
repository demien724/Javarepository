package 제어문문제;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기2 {
	public static void main(String[] args) {

		// 입력
		JFrame frame = new JFrame();
		FlowLayout flow = new FlowLayout();
		Dimension IamgeSize = new Dimension(300, 200);

		JLabel titleImage = new JLabel();
		JLabel label01 = new JLabel(); // 아이디
		JLabel label02 = new JLabel(); // 패스워드
		JLabel label03 = new JLabel(); // 이름
		JLabel label04 = new JLabel(); // 전화번호

		ImageIcon icon = new ImageIcon("login.png");
		
		JTextField text01 = new JTextField(15); // 아이디 입력
		JTextField text02 = new JTextField(15); // 패스워드 입력
		JTextField text03 = new JTextField(15); // 이름 입력
		JTextField text04 = new JTextField(15); // 전화번호 입력

		JButton button = new JButton();	// 회원가입 

		Font font01 = new Font("LG PC",1, 25);
//		처리
		frame.setSize(350, 600);
		frame.setLayout(flow);	// 정렬 처리
	
		titleImage.setPreferredSize(IamgeSize);	// 타이틀 이미지 틀 크기 변경, 이미지 자체의 크기는 바뀌지 않음
		titleImage.setIcon(icon);
		
		label01.setFont(font01);	// 라벨
		label02.setFont(font01);
		label03.setFont(font01);
		label04.setFont(font01);
		text01.setFont(font01);		// 텍스트
		text02.setFont(font01);
		text03.setFont(font01);
		text04.setFont(font01);
		button.setFont(font01);		// 버튼
		
		label01.setText("아이디");
		label02.setText("패스워드");
		label03.setText("이름");
		label04.setText("전화번호");
		button.setText("회원가입처리");
		
		frame.add(titleImage);
		frame.add(label01);
		frame.add(text01);
		frame.add(label02);
		frame.add(text02);
		frame.add(label03);
		frame.add(text03);
		frame.add(label04);
		frame.add(text04);
		frame.add(button);
		
//		출력
		frame.setVisible(true);
	}
}
