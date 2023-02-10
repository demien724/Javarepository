package 제어문문제;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기투표 {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		
		FlowLayout flow = new FlowLayout();

		JLabel Title = new JLabel(); // 타이틀
		JLabel label01 = new JLabel(); // 1번 가수
		JLabel label02 = new JLabel(); // 1번 가수 표
		JLabel label03 = new JLabel(); // 2번 가수
		JLabel label04 = new JLabel(); // 2번 가수 표
		JLabel label05 = new JLabel(); // 3번 가수
		JLabel label06 = new JLabel(); // 3번 가수 표

		// 버튼을 누르면 투표수가 증가하면서 즉시 반영
		JButton button01 = new JButton(); // 1번 가수
		JButton button02 = new JButton(); // 2번 가수
		JButton button03 = new JButton(); // 3번 가수

		// 이미지
		ImageIcon icon01 = new ImageIcon("firstAlbum.jpg"); // 1번 가수 앨범 커버
		ImageIcon icon02 = new ImageIcon("secondAlbum.jpg"); // 2번 가수 앨범 커버
		ImageIcon icon03 = new ImageIcon("thirdAlbum.jpg"); // 3번 가수 앨범 커버

		Font font01 = new Font("LG PC", 1, 50);
		Font font02 = new Font("LG PC", 1, 20);

/////////////////////
//		처리
		frame.setSize(400, 800);
		frame.setLayout(flow);

		Title.setText("K팝 인기 투표");

		label01.setText("1. 아이유");
		label02.setText("");
		label03.setText("2. BTS");
		label04.setText("");
		label05.setText("3. 뉴진스");
		label06.setText("");

		label02.setForeground(Color.red);
		label04.setForeground(Color.red);
		label06.setForeground(Color.red);

		button01.setIcon(icon01);
		button02.setIcon(icon02);
		button03.setIcon(icon03);

		button01.setPreferredSize(new Dimension(200, 200));
		button02.setPreferredSize(new Dimension(200, 200));
		button03.setPreferredSize(new Dimension(200, 200));

		Title.setFont(font01);
		label01.setFont(font02);
		label02.setFont(font02);
		label03.setFont(font02);
		label04.setFont(font02);
		label05.setFont(font02);
		label06.setFont(font02);

		frame.add(Title);
		frame.add(label01);
		frame.add(button01);
		frame.add(label01);
		frame.add(label02);

		frame.add(button02);
		frame.add(label03);
		frame.add(label04);
		
		frame.add(button03);
		frame.add(label05);
		frame.add(label06);

		button01.addActionListener(new ActionListener() {
			int vote = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				vote = vote + 1;
				label02.setText(vote + "표");
			}
		});
		
		button02.addActionListener(new ActionListener() {
			int vote = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				vote = vote + 1;
				label04.setText(vote + "표");
			}
		});
		
		button03.addActionListener(new ActionListener() {
			int vote = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				vote = vote + 1;
				label06.setText(vote + "표");
			}
		});
		
		button03.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
			}
		});

//		출력
		frame.setVisible(true);
	}

}
