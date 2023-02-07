package 순차문;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기1 {
	public static void main(String[] args) {
//		자주 사용하지 않는 부품을 만들어보자.
//		정해진 틀을 만들고, 필요한 부품을 만들어 CPU가 조립! 
//		new = 틀을 갖고 찍어낼때 사용
//		new JFrame() JFrame이라는 틀을 이용해서 부품을 찍어내라.
//		만든 부품은 모두 다 RAM에 저장

		JFrame frame01 = new JFrame();
		frame01.setSize(475, 150);

//		물흐르듯이 순서대로 배치해주는 부품을 복사해서 램에 가져다 놓아야함
		FlowLayout flow = new FlowLayout();

//		f에 물흐르듯이 배치해주는 부품을 쓰겠다라고 조립 (설정)
		frame01.setLayout(flow);

		JButton button01 = new JButton();
		button01.setText("버튼 세팅 1");

		JButton button02 = new JButton();
		button02.setText("버튼 세팅 2");

		JLabel text1 = new JLabel();
		text1.setText("아이디");

		JLabel text2 = new JLabel();
		text2.setText("패스워드");

		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		Font font = new Font("고딕", 1, 20);
		text1.setFont(font);
		input1.setFont(font);
		button01.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		button02.setFont(font);
		
		ImageIcon img1 = new ImageIcon("CherryBlossom.jpg");
		ImageIcon img2 = new ImageIcon("Owl.jpg");
		
		button01.setIcon(img1);
		button02.setIcon(img2);
		
		frame01.add(text1);
		frame01.add(input1);
		frame01.add(button01);
		frame01.add(text2);
		frame01.add(input2);
		frame01.add(button02);

		frame01.setVisible(true);
	}
}
