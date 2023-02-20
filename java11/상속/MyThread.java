package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyThread extends Thread {

	int x;
	int y;
	JLabel label; // 전역변수

	public MyThread(String file, int x, int y) { // 생성자
		this.x = x;
		this.y = y;

		ImageIcon icon = new ImageIcon(file);
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(x, y, 100, 100); // Jframe의 붙은 위치 지정
		
	}

	public void run() {
		// 동시에 실행하고 싶다는 내용
		// 모든 스레드가 오른쪽으로 움직이고 싶음
		// 화면에서 오른쪽으로 움직이는 것을 x을 늘려주는 것

		Random r = new Random();
		for (int i = 0; i < 200; i++) {
			int move = r.nextInt(50);
			x = x + move;
			label.setBounds(x, y, 100, 100); // 위치 지정
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
