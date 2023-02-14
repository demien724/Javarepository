package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템1 {

	public static void main(String[] args) {
//		입력
		JFrame frame = new JFrame(); // 프레임
		FlowLayout flow = new FlowLayout(); // 레이아웃

		int num = 100; // 버튼의 개수
		int[] confirm = new int[num]; // 예약 시 변경

		JButton[] btn = new JButton[num]; // 버튼
		JButton check = new JButton(); // 최종확인 버튼

		JLabel text = new JLabel(); // 예약 확인 텍스트

		Font font01 = new Font("LG PC", Font.BOLD, 20);
		Font font02 = new Font("LG PC", Font.BOLD, 40);

//		처리
		frame.setSize(750, 600);
		frame.setLayout(flow);

		text.setText("영화 예매 시스템");
		text.setFont(font02);

		check.setText("얼마나 예매");
		check.setFont(font02);
		check.setBackground(Color.black);
		check.setForeground(Color.white);

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + 1 + "");
			btn[i].setFont(font01);

			frame.add(btn[i]);

			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String str = e.getActionCommand();
					int num = Integer.parseInt(str) - 1;

					if (confirm[num] == 0) {
						confirm[num] = 1;

						text.setText(str + "번 자리 예약 되셨습니다.");
						text.setForeground(Color.blue);
					} else {
						int cancel = JOptionPane.showConfirmDialog(frame, "해당 자리를 취소하시겠습니까?");

						switch (cancel) {
						case 0:
							confirm[num] = 0;
							
							text.setText(str + "번 자리가 예약이 취소되었습니다.");
							text.setForeground(Color.black);
							break;
						case 1:
							text.setText("다른 자리를 예약해 주세요");
							text.setForeground(Color.red);
							break;
						default:
							break;
						}
					}

				}
			});
		}
		
		
		
		check.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count =0;
				
				for (int i = 0; i < btn.length; i++) {
					if(confirm[i] == 1) {
						count ++;
					}
				}
				JOptionPane.showMessageDialog(frame, count * 10000 + "원 ");
			}
		});

		frame.add(text);
		frame.add(check);

//		출력
		frame.setVisible(true);
	}

}
