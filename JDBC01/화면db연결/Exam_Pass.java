package 화면db연결;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exam_Pass {

	// 시험 합격 여부 확인용
	public static void Confirm(String str) {
		if(str.equals("Admin")) {
			Update();
		} else {
			Check();
		}
	}
	
	private static void Check() {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER);

		f.setSize(400, 350);
		f.setTitle("시험 패스");
		f.setLayout(flow);
		f.setResizable(false);

		JLabel l1 = new JLabel(); // 수험번호
		l1.setText("수험번호");

		JTextField t1 = new JTextField(10); // 수험번호 입력

		JButton b1 = new JButton("확인"); // 버튼
		JButton b2 = new JButton("취소");

		Font font1 = new Font("궁서", Font.BOLD, 30); // 폰트
		l1.setFont(font1);
		t1.setFont(font1);
		b1.setFont(font1);
		b2.setFont(font1);

		b1.addActionListener(new ActionListener() { // 시험 패스 여부 확인

			public void actionPerformed(ActionEvent e) {
				String str = t1.getText();

				ExamDAO dao = new ExamDAO();
				String result = dao.pass(str);

				if (result.equals("합격")) {
					JOptionPane.showMessageDialog(f, "축하드립니다\n 귀하는 귀하는 시험에 합격하셨습니다.");
				} else if(result.equals("불합격")) {
					JOptionPane.showMessageDialog(f, "귀하께서는 시험에 합격하지 못하였습니다.");
				}
			}
		});

		b2.addActionListener(new ActionListener() { // 시험 패스 여부 확인

			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
			}
		});

		f.add(l1);
		f.add(t1);
		f.add(b1);
		f.add(b2);
		f.setVisible(true);
	}
	
	
	private static void Update() {
		System.out.println("관리자 입장");
	}

}
