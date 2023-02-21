package 주식정보시스템;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class 네이버주식정보시스템 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(225, 400);
		frame.getContentPane().setBackground(Color.green);
		frame.setLayout(new FlowLayout());
		
		Font font = new Font("궁서", Font.BOLD, 30);
		JButton b1 = new JButton("삼성전자");
		JButton b2 = new JButton("카카오");
		JButton b3 = new JButton("네이버");
		JButton b4 = new JButton("크롤링 시작");
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
		b2.setForeground(Color.black);
		b3.setForeground(Color.white);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.blue);
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		
		JLabel label = new JLabel("Code");
		label.setFont(font);
		
		JTextField text = new JTextField(6);
		text.setFont(font);

		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(label);
		frame.add(text);
		frame.add(b4);
		
		/*
		 * 		액션 처리 부분
		 * 		1~3까지 삼성전자, 카카오, 네이버
		 */
		
		b4.addActionListener(new ActionListener() {
			// 삼성
			public void actionPerformed(ActionEvent e) {
						네이버증권크롤링3 c = new 네이버증권크롤링3();
						c.naver("005930");
			}
		});
		
		b1.addActionListener(new ActionListener() {
			// 삼성
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				c.naver("005930");
			}
		});
		b2.addActionListener(new ActionListener() {
			// 카카오
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				c.naver("035720");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			// 네이버
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				c.naver("035420");
			}
		});
		
		b4.addActionListener(new ActionListener() {
			// 삼성
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				c.naver(text.toString());
			}
		});
		
		
		
		frame.setVisible(true);
	}
}
