package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// 입력
		JFrame frame = new JFrame(); // 프레임
		JButton[] buttons = new JButton[500]; // 버튼

		Random random = new Random(); // 랜덤
		Color[] colors = new Color[500];
		// 처리
		frame.setSize(600, 900);
		frame.setLayout(null);
		frame.getContentPane().setBackground(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
		
		for (int i = 0; i < buttons.length; i++) {
			int x = random.nextInt(500);
			int y = random.nextInt(800);
			colors[i] = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));

			buttons[i] = new JButton("버튼" + i);
			buttons[i].setBounds(x, y, 100, 50);
			buttons[i].setBackground(colors[i]);
			frame.add(buttons[i]);
		}

		frame.setVisible(true);
	}

}
