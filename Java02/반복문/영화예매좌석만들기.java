package 반복문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 영화예매좌석만들기 {

	public static void main(String[] args) {
		JFrame frame = new JFrame(); // 프레임 틀 생성
		frame.setSize(300, 500); // 프레임 사이즈를 변경

		FlowLayout flow = new FlowLayout(); // 프레임 내 오브젝트 배치 틀은 생성
		frame.setLayout(flow); // 프레임에 레이아웃을 배치

		for (int i = 0; i < 100; i++) {
			JButton b = new JButton();
			b.setText("좌석");
			frame.add(b);
		}

		frame.setVisible(true); // 프레임을 보여줌
	}

}
