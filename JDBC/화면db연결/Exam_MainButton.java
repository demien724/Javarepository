package 화면db연결;

import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exam_MainButton {

	// Not Admin
	public void ExamPassButton() {
		// 프레임 구성
		JFrame frame = new JFrame();
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);
		frame.setSize(400, 350);
		frame.setTitle("합격 확인");
		frame.setResizable(false);

		// 프레임 컨텐츠
		JLabel l1 = new JLabel("수험 번호 확인");
		JTextField t1 = new JTextField(10);
		JButton b1 = new JButton("결과 확인");

		JLabel warning = new JLabel("수험 번호는 대문자와 소문자를 확실히 구분합니다.");

		JLabel enter = new JLabel("\n");

		Font font1 = new Font("LG PC", Font.BOLD, 20);
		Font font2 = new Font("LG PC", Font.BOLD, 40);
		

		l1.setFont(font2);
		t1.setFont(font2);
		b1.setFont(font2);
		
		JTextArea text = new JTextArea();
		text.setForeground(Color.decode("#3b7fff"));
		text.setBackground(Color.decode("#ebebeb"));
		text.setPreferredSize(new Dimension(370,200));
		text.setLineWrap(true);
		text.setFont(font1);

		warning.setFont(font1);
		warning.setForeground(Color.decode("#ff5959"));
		
		b1.setForeground(Color.white);
		b1.setBackground(Color.decode("#637182"));
		b1.setFocusPainted(false);
		b1.setPreferredSize(new Dimension(340,50));

		frame.add(l1);
		frame.add(t1);
		frame.add(b1);
		frame.add(warning);
		frame.add(enter);
		frame.add(text);
		
		
		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				ExamPassDAO examPass = new ExamPassDAO();
				ExamPassVO VO = examPass.checkGrade(t1.getText());
				System.out.println(VO.getCert_Pass());
				String resultString = null;
				if(t1.getText().equals("")) {
					JOptionPane.showMessageDialog(frame,"수험번호를 입력해주시기 바랍니다.");
				}
				else {
					switch (VO.getCert_Pass()) {
					case -1:
						text.setText(" ");
						
						resultString = "귀하께서는 " + VO.getCert_Day() + "에 응시하신 " + VO.getCert_Name() + "시험 에 불합격하셨습니다.";
						JOptionPane.showMessageDialog(frame, resultString);
						
						
						
						break;
					case 0:
						text.setText(" ");
						
						resultString = "귀하께서 보신 " + VO.getCert_Name() + " 시험에 대한 처리가 진행중입니다.";
						JOptionPane.showMessageDialog(frame, resultString);
						break;
					case 1:

					
						text.setText("자격증 발급을 원하실 경우\n홈페이지에 나온 발급 절차를 밟아주시면\n대단히 감사드리겠습니다.\n귀하의 합격을 다시 한번 더 축하드립니다.");
						
						
						resultString = "축하드립니다.\n귀하께서 " + VO.getCert_Day() + "에 응시하신\n" + VO.getCert_Name()
								+ " 시험에 합격하셨습니다.";
						JOptionPane.showMessageDialog(frame, resultString);

						break;
					default:
						text.setText(" ");
						JOptionPane.showMessageDialog(frame, "존재하지 않은 수험번호 입니다.");
						break;
					}
				}
				
			}
		});

		frame.setVisible(true);
		
	
	}

	// Admin
	public void ExamUpdateButton() {
		JFrame frame = new JFrame();
		FlowLayout flow = new FlowLayout();

		frame.setLayout(flow);
		frame.setSize(400, 400);
		frame.setTitle("수험 합격 업데이트");
		frame.setResizable(false);

		JLabel enter = new JLabel("\n");
		Font font1 = new Font("LG PC", Font.BOLD, 20);
		Font font2 = new Font("LG PC", Font.BOLD, 30);

		JLabel l1 = new JLabel("수험 번호 입력");
		JTextField t1 = new JTextField(13);
		JButton b1 = new JButton("검색");

		JLabel l2 = new JLabel("수험생 이름");
		JLabel l3 = new JLabel("시험 응시 날짜");
		JTextField t2 = new JTextField(13);
		JTextField t3 = new JTextField(13);

		JRadioButton rb1 = new JRadioButton("합격");
		JRadioButton rb2 = new JRadioButton("처리중");
		JRadioButton rb3 = new JRadioButton("불합격");

		
		
		rb1.setFocusPainted(false);
		rb2.setFocusPainted(false);
		rb3.setFocusPainted(false);
		JButton b2 = new JButton("업데이트");
		
		frame.getContentPane().setBackground(Color.decode("#ebebeb"));
		rb1.setBackground(Color.decode("#ebebeb"));
		rb2.setBackground(Color.decode("#ebebeb"));
		rb3.setBackground(Color.decode("#ebebeb"));
		
		b1.setFocusPainted(false);
		b2.setFocusPainted(false);
	
		b1.setBackground(Color.decode("#637182"));
		b2.setBackground(Color.decode("#637182"));
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		
		
		t2.setEnabled(false);
		t3.setEnabled(false);

		l1.setFont(font2);
		t1.setFont(font2);
		b1.setFont(font1);

		l2.setFont(font2);
		t2.setFont(font2);
		l3.setFont(font2);
		t3.setFont(font2);
		
		t2.setForeground(Color.black);
		t3.setForeground(Color.black);

		rb1.setFont(font1);
		rb2.setFont(font1);
		rb3.setFont(font1);

		rb2.setSelected(true); // rb2를 처음 봤을때 선택값으로 놔둠

		ButtonGroup gb = new ButtonGroup();
		gb.add(rb1);
		gb.add(rb2);
		gb.add(rb3);

	

		
		// 학생 정보 확인 버튼
		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ExamPassVO resultVO = new ExamPassVO();
				String confirmText = t1.getText();
				
				if (confirmText.equals("")) {
					JOptionPane.showMessageDialog(frame, "수험번호를 입력해주세요");
				} else {
					String certNum = t1.getText();

					ExamPassVO vo = new ExamPassVO();		// VO 생성
					vo.setCert_Num(certNum);					// 해당 VO에 수험번호 입력

					ExamPassDAO DAO = new ExamPassDAO();
					resultVO = DAO.showInfo(vo);				// VO를 넘겨줌
					
					if(resultVO.getCert_Num() != null) {
						t2.setText(resultVO.getCert_Name());
						t3.setText(resultVO.getCert_Day());
						
						System.out.println(resultVO.getCert_Num());
						System.out.println(resultVO.getCert_Name());
						System.out.println(resultVO.getCert_Day());
						System.out.println(resultVO.getCert_Pass()
								);
					} else {
						JOptionPane.showMessageDialog(frame, "존재하지 않은 수험 번호 입니다.");
						t2.setText("");
						t3.setText("");
						
					}
				}

			}
		});

		
		// 수험 결과 업데이트 버튼
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String certNum = t1.getText(); // 수험 번호
				int updateResult = 0; // 시험 결과

				if (rb1.isSelected()) // 불합격
				{
					updateResult = 1;
				} else if (rb2.isSelected()) { // 처리 중
					updateResult = 0;
				} else if (rb3.isSelected()) { // 합격
					updateResult = -1;
				}

				ExamPassVO vo = new ExamPassVO();
				vo.setCert_Num(certNum);
				vo.setCert_Pass(updateResult);

				ExamPassDAO DAO = new ExamPassDAO();
				int result = DAO.updateGrade(vo);
				
				if (result == 1) {
					JOptionPane.showMessageDialog(frame,"업데이트 되었습니다.");
				} else {
					JOptionPane.showMessageDialog(frame, "존재 하지 않은 수험 번호 입니다.");
				}
			}

		});

		frame.add(l1);
		frame.add(b1);
		frame.add(t1);
		frame.add(enter);

		frame.add(l2);
		frame.add(t2);
		frame.add(enter);
		frame.add(l3);
		frame.add(t3);
		frame.add(enter);

		frame.add(enter);
		frame.add(rb1);
		frame.add(rb2);
		frame.add(rb3);

		frame.add(b2);

		frame.setVisible(true);
	}
}
