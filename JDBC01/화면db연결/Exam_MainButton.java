package 화면db연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Exam_MainButton {
	
	
	public void ExamPassButton() {
		// 프레임 구성
		JFrame frame = new JFrame();
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);	frame.setSize(400, 350);	frame.setTitle("합격 확인");		frame.setResizable(false);
		
		
		// 프레임 컨텐츠
		JLabel l1 = new JLabel("수험 번호 확인");
		JTextField t1 = new JTextField(10);
		JButton	b1 = new JButton("결과 확인");
		
		JLabel warning = new JLabel("수험 번호는 대문자와 소문자를 확실히 구분합니다.");
		
		JLabel enter = new JLabel("\n");
		
		
		Font font1 = new Font("LG PC", Font.BOLD, 20);
		Font font2 = new Font("LG PC", Font.BOLD, 40);
		
		
		l1.setFont(font2);
		t1.setFont(font2);
		b1.setFont(font2);
		
		warning.setFont(font1);
		warning.setForeground(Color.red);
		
		frame.add(l1);
		frame.add(t1);
		frame.add(b1);
		frame.add(warning);		
		frame.add(enter);
		
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ExamPassDAO examPass = new ExamPassDAO();
				ExamPassVO VO = examPass.checkGrade(t1.getText());
				
				String resultString = null;
				
				switch (VO.getCert_Pass()) {
				case -1:
					resultString = "귀하께서는 " + VO.getCert_Name() + "시험 에 불합격하셨습니다.";
					JOptionPane.showMessageDialog(frame, resultString);
					break;
				case 0:
					resultString = "귀하께서 보신 " + VO.getCert_Name() + " 시험에 대한 처리가 진행중입니다.";
					JOptionPane.showMessageDialog(frame, resultString);
					break;
				case 1:
					resultString = "축하드립니다.\n 귀하께서는 응시하신" + VO.getCert_Name() + " 시험에 합격하셨습니다.";
					JOptionPane.showMessageDialog(frame, resultString);
					break;
				default:
					JOptionPane.showMessageDialog(frame, "수험번호를 확인해주시기 바랍니다.");
					break;
				}
			}
		});
		
		frame.setVisible(true);
	}
	
	
	
	
	public void ExamUpdateButton() {
		JFrame frame = new JFrame();
		FlowLayout flow = new FlowLayout();
		
	
		frame.setLayout(flow);	frame.setSize(300, 400);	frame.setTitle("수험 합격 업데이트");		frame.setResizable(false);
	
		Font font1 = new Font("LG PC", Font.BOLD, 20);
		
		JLabel l1 = new JLabel("수험 번호 확인");
		JTextField t1 = new JTextField(10);
		JButton	b1 = new JButton("확인");
		
		l1.setFont(font1);
		t1.setFont(font1);
		b1.setFont(font1);
		
		JRadioButton rb1 = new JRadioButton("불합격");
		JRadioButton rb2 = new JRadioButton("처리중");
		JRadioButton rb3 = new JRadioButton("합격");
		
		rb2.setSelected(true);				// rb2를 처음 봤을때 선택값으로 놔둠
		
		ButtonGroup gb = new ButtonGroup();
		gb.add(rb1);	gb.add(rb2);	gb.add(rb3);
		
		JButton b2 = new JButton("업데이트");
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String certNum = t1.getText();			// 수험 번호
				int updateResult = 0;						// 시험 결과
				
				
				
				if(rb1.isSelected())		// 불합격
				{
					updateResult = -1;
				} else if(rb2.isSelected()) {		// 처리 중
					updateResult = 0;
				}
				else if(rb3.isSelected()) {		// 합격
					updateResult = 1;
				}
				
				
				
				ExamPassDAO DAO = new ExamPassDAO();
				int result = DAO.updateGrade(certNum, updateResult);
				if(result == 1) {
					JOptionPane.showMessageDialog(frame, "업데이트 되었습니다.");
				}
			}
			
		});
		
		frame.add(l1);
		frame.add(t1);
		frame.add(b1);
		
		frame.add(rb1);
		frame.add(rb2);
		frame.add(rb3);
		
		frame.add(b2);
		
		frame.setVisible(true);
	}
}
