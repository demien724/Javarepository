package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class 문자판독기 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("문자판독기");
		frame.setLayout(new FlowLayout());
		frame.setSize(300, 500);

		Font font1 = new Font("LG PC", Font.BOLD, 20);
		Font font2 = new Font("LG PC", Font.BOLD, 15);

		JLabel word = new JLabel("Word");

		JTextArea textArea = new JTextArea(7, 15);

		JButton button01 = new JButton("Count");
		JButton button02 = new JButton("Back");
		JButton button03 = new JButton("Front");

		word.setFont(font1);
		textArea.setFont(font1);
		button01.setFont(font2);
		button02.setFont(font2);
		button03.setFont(font2);

		frame.add(word);
		frame.add(textArea);
		frame.add(button01);
		frame.add(button02);
		frame.add(button03);

		button01.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String str = textArea.getText();
				JOptionPane.showMessageDialog(frame, "글자 수는 " + str.length());
			}
		});

		button02.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (textArea.getBackground() == Color.black) {
					textArea.setBackground(Color.white);
				} else {
					textArea.setBackground(Color.black);
				}
			}
		});
		button03.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (textArea.getForeground() == Color.black) {
					textArea.setBackground(Color.white);
				} else {
					textArea.setForeground(Color.black);
				}
			}
		});

		frame.setVisible(true);
	}

}
