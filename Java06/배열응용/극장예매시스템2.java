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

public class 극장예매시스템2 {

	public static void main(String[] args) {
		// 입력
		JFrame frame = new JFrame();
		FlowLayout flow = new FlowLayout();					

		JButton[] buttons = new JButton[200];					// 예약 버튼
		JButton total = new JButton();
		
		JLabel result = new JLabel();								// 결과 문구
				
		Font font = new Font("LG PC", Font.BOLD, 20);	// 글씨체

		int[] seat = new int[200];									// 예약 확인
		// 처리
		frame.setTitle("극장 예매 시스템");
		frame.setLayout(flow);

		frame.setSize(900, 900);

		
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i + "");
			buttons[i].setFont(font);
			frame.add(buttons[i]);
			
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					// e.GetActionCommand(); << 해당 버튼의 텍스트를 가져옵니다.
					
					
					String text = e.getActionCommand();				// 버튼의 텍스트를 가지고 옴
					int no = Integer.parseInt(text);						// 버튼(String)을 Int 타입으로 변경함
					
//					System.out.println(text + " , " + no);	
					
					if(seat[no] == 1) {
						result.setText("예약이 불가능");
						result.setForeground(Color.blue);
					}
					else {
						result.setText(text + "번 예약 완료");
						seat[no] = 1;
						buttons[no].setBackground(Color.red);
						buttons[no].setEnabled(false);					// 버튼 비활성화
					}
						
				}
			});
		}

		result.setText("결과 보이는 곳");
		result.setForeground(Color.red);
		result.setFont(font);

		total.setText("전체 예약 내역");
		total.setFont(font);
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				for (int i = 0; i < seat.length; i++) {
					if(seat[i] == 1) {
						count ++;
					}
				}
				
				JOptionPane.showMessageDialog(frame, count*10000 + "원 결제해주세요");
				
			}
		});
		
		frame.add(result);
		frame.add(total);
		

		// 출럭
		frame.setVisible(true);
	}

}
