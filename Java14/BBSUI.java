package 자바db연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BBSUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setTitle("게시판");
		frame.setSize(500, 700);

		JLabel label01 = new JLabel("    회원가입 화면    ");
		JLabel label02 = new JLabel("아이디");
		JLabel label03 = new JLabel("패스워드");
		JLabel label04 = new JLabel("이름");
		JLabel label05 = new JLabel("전화번호");

		JButton b1 = new JButton("회원가입 처리");
		JButton b2 = new JButton("회원탈퇴 처리");
		JButton b3 = new JButton("회원수정 처리");
		JButton b4 = new JButton("회원검색 처리");

		JTextField text01 = new JTextField(15);
		JTextField text02 = new JTextField(15);
		JTextField text03 = new JTextField(15);
		JTextField text04 = new JTextField(15);

		FlowLayout flow = new FlowLayout();
		
		frame.setLayout(flow);

		Font font = new Font("LG PC", Font.BOLD , 35);
		Font titleFont = new Font("LG PC",Font.BOLD,50);

		label01.setFont(titleFont);
		label02.setFont(font); text01.setFont(font);
		label03.setFont(font); text02.setFont(font);
		label04.setFont(font); text03.setFont(font);
		label05.setFont(font); text04.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		
		label01.setBackground(Color.white);
		label01.setForeground(Color.white);
		
		frame.add(label01);
		frame.add(label02); frame.add(text01);
		frame.add(label03); frame.add(text02);
		frame.add(label04); frame.add(text03);
		frame.add(label05); frame.add(text04);
		
		frame.add(b1); frame.add(b2);
		frame.add(b3); frame.add(b4);
		
		frame.getContentPane().setBackground(Color.decode("#72f788"));
		
		frame.setVisible(true);
	}

}
