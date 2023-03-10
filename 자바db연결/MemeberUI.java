package 자바db연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MemeberUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setTitle("회원 가입");
		frame.setSize(500, 700);

		JLabel label01 = new JLabel("    회원가입 화면    ");
		JLabel label02 = new JLabel("아이디");
		JLabel label03 = new JLabel("패스워드");
		JLabel label04 = new JLabel("이름");
		JLabel label05 = new JLabel("전화번호");

		JButton b1 = new JButton("회원가입 처리");
		JButton b2 = new JButton("회원탈퇴 처리");
		JButton b3 = new JButton("회원수정 처리");
		JButton b4 = new JButton("회원검색 처리");

		JTextField text01 = new JTextField(15);
		JTextField text02 = new JTextField(15);
		JTextField text03 = new JTextField(15);
		JTextField text04 = new JTextField(15);

		FlowLayout flow = new FlowLayout();
		
		frame.setLayout(flow);

		Font font = new Font("LG PC", Font.BOLD , 35);
		Font titleFont = new Font("LG PC",Font.BOLD,50);

		label01.setFont(titleFont);
		label02.setFont(font); text01.setFont(font);
		label03.setFont(font); text02.setFont(font);
		label04.setFont(font); text03.setFont(font);
		label05.setFont(font); text04.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		
		label01.setBackground(Color.white);
		label01.setForeground(Color.red);
		b1.setBackground(Color.white);
		b1.setForeground(Color.red);
		b2.setBackground(Color.white);
		b2.setForeground(Color.red);
		b3.setBackground(Color.white);
		b3.setForeground(Color.red);
		b4.setForeground(Color.red);
		b4.setBackground(Color.white);
		
		
		frame.add(label01);
		frame.add(label02); frame.add(text01);
		frame.add(label03); frame.add(text02);
		frame.add(label04); frame.add(text03);
		frame.add(label05); frame.add(text04);
		
		frame.add(b1); frame.add(b2);
		frame.add(b3); frame.add(b4);
		
		frame.getContentPane().setBackground(Color.decode("#72f788"));
		
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String id = text01.getText();
				String pw = text02.getText();
				String name = text03.getText();
				String tel = text04.getText();
				
				MemberDAO2 dao = new MemberDAO2();
				int result = dao.insert(id, pw, name, tel);//1 or 0
				
				if(result == 1) {
					JOptionPane.showMessageDialog(frame, "회원가입 성공");
				}else {
					JOptionPane.showMessageDialog(frame, "회원가입 실패, 재입력해주세요.");
				}
				
			
			} // action
		});
		
		// 회원 탈퇴
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String id = text01.getText();
				String pw = text02.getText();
				String name = text03.getText();
				String tel = text04.getText();
				
				if(id.equals("")) {
					JOptionPane.showMessageDialog(frame, "아이디는 필수 입력 항목입니다.");
					return;
				}
				
				MemberDAO2 dao = new MemberDAO2();
				int result = dao.delete(id);
				System.out.println(result);
				if(result >= 1) {
					JOptionPane.showMessageDialog(frame, "회원탈퇴 성공");
				}else {
					JOptionPane.showMessageDialog(frame, "회원탈퇴 실패, 재입력해주세요.");
				}
			} // action
		});
		
		// 회원 수정
		b3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String id = text01.getText();
				String pw = text02.getText();
				String name = text03.getText();
				String tel = text04.getText();
				
				MemberDAO2 dao = new MemberDAO2();
				dao.update(tel, id);
			} // action
		});
		
		frame.setVisible(true);
	}

}
