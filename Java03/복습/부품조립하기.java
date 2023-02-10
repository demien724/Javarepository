package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
//			1. 자주 써서 RAM에 언제든 사용할수 있도록 준비되어있음 (망치)
//				부품명.기능(	);

//			2. 쓸때마다 제공되는 틀을 이용해서 찍어낸 여러개들은 RAM에 저장해두고 사용 (벽돌)
//				벽돌 변수명 = new 벽돌(	);

//		입력
			JFrame frame = new JFrame();				// 프레임을 생성
			
			FlowLayout flow = new FlowLayout();		// 레이아웃 생성
			
			JLabel label = new JLabel();					// 레이블
			
			JTextField text = new JTextField(10);		// 텍스트필드 생성
				
			JButton button = new JButton();
			
			Font font1 = new Font("LG PC", 1, 20);
			Font font2 = new Font("D2Coding", 1, 25);
			
			
//		처리
			frame.getContentPane().setBackground(Color.black);	// 프레임 전체 배경의 색상을 변경함
			
			frame.setSize(300, 450);						// 프레임의 크기를 설정
			frame.setLayout(flow);							// 프레임의 배치방식을 결정
			
			label.setText("당신이 생각한 숫자는?");		// 라벨 텍스트 설정
			label.setForeground(Color.red);
			label.setFont(font1);
			
			text.setFont(font1);
			
			button.setBackground(Color.orange);
			button.setForeground(Color.red);
			button.setFont(font2);
			button.setText("숫자 맞추기 게임");
			
			frame.add(label);
			frame.add(text);
			frame.add(button);
			
//		출력
			frame.setVisible(true);
		
	}
}
