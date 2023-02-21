package 형변환;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 그래픽형변환 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 500);
		
		
//		FlowLayout flow = new FlowLayout();
		frame.setLayout(new FlowLayout());
		
		frame.add(new JButton("나는 버튼"));		// Component << JButton (자동형변환)
		frame.add(new JLabel("나는 라벨"));
		frame.add(new JTextField(10));
		
		frame.setVisible(true);
	}

}
