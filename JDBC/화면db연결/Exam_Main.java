package 화면db연결;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_Main {

	public void OpenIndex(ExamMemberVO loginMember) {
		JFrame frame = new JFrame();
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER);

		frame.setLayout(flow);
		frame.setSize(600, 350);
		frame.setTitle("메인 페이지");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.decode("#9ccfff"));
		
		JLabel title = new JLabel("<메인 페이지>");
		JButton b1 = new JButton("		원서 접수	");
		JButton b2 = new JButton("	합격 여부 확인	");
		JButton b3 = new JButton("	자유 게시판		");

		frame.add(title);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);

		Font font1 = new Font("LG PC", Font.BOLD, 40);
		
		title.setFont(font1);
		b1.setFont(font1);
		b2.setFont(font1);
		b3.setFont(font1);
	
		
		b1.setPreferredSize(new Dimension(500,50));
		b2.setPreferredSize(new Dimension(500,50));
		b3.setPreferredSize(new Dimension(500,50));
		
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		
		b1.setFocusPainted(false);
		b2.setFocusPainted(false);
		b3.setFocusPainted(false);
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exam_MainButton b2_Page = new Exam_MainButton();

				if (loginMember.getID().equals("Admin")) {
					b2_Page.ExamUpdateButton();
				} else {
					b2_Page.ExamPassButton();
				}
			}
		});

		frame.setVisible(true);
	}

}
