package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(500, 300);
		
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);
		
		JLabel label1 = new JLabel();
		label1.setText("숫자 1");
		
		JLabel label2 = new JLabel();
		label2.setText("숫자 2");
		
		ImageIcon img1 = new ImageIcon("CalCulator.jpg");
		JLabel label3 = new JLabel();
		label3.setIcon(img1);
		
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		
		Font font = new Font("굴림", 1, 50);
		
		JButton b1 = new JButton();
		b1.setText("+");
		
		JButton b2 = new JButton();
		b2.setText("-");
		
		JButton b3 = new JButton();
		b3.setText("*");
		
		JButton b4 = new JButton();
		b4.setText("/");
		
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		
		label1.setFont(font);
		text1.setFont(font);		
		label2.setFont(font);
		text2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		frame.add(label3);
		frame.add(label1);
		frame.add(text1);
		frame.add(label2);
		frame.add(text2);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		
		frame.setVisible(true);
	}

}
