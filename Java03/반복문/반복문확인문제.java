package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 반복문확인문제 {

	public static void main(String[] args) {
		// 입력
		JFrame frame = new JFrame();
		FlowLayout flow = new FlowLayout();

		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();

		Font font = new Font("LG PC", 1, 40);

		// 처리
		frame.setSize(300, 450);
		frame.setLayout(flow);
		frame.getContentPane().setBackground(Color.orange);

		button1.setBackground(Color.magenta);
		button2.setBackground(Color.white);
		button3.setBackground(Color.magenta);
		button4.setBackground(Color.white);

		button1.setText("별 10개");
		button2.setText("커피 * 5 ");
		button3.setText("커피* 우유3");
		button4.setText("1: 짱!");

		button1.setFont(font);
		button2.setFont(font);
		button3.setFont(font);
		button4.setFont(font);

		button1.setSize(200, 100);
		button2.setSize(200, 100);
		button3.setSize(200, 100);
		button4.setSize(200, 100);

		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);

		
//			1. 버튼에 액션기능을 추가
//			2. 클릭 액션이 있을 때 어떤 부품이 액션처리를 어떻게 할지를 코딩
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b1을 클릭했음");
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println("");

			}
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b2을 클릭했음");
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}

			}
		});
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b3을 클릭했음");
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}

			}
		});
		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b4을 클릭했음");
				for (int i = 0; i < 3; i++) {
					System.out.println(i + ": 짱");
				}
			}
		});

//			출력
		frame.setVisible(true);
	}
}
