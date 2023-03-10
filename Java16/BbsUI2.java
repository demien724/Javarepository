package 화면db연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import 자바db연결.BBSDAO;


public class BbsUI2 {
	
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	
	
	public static void openBBS() {
		JFrame f = new JFrame();
		
		f.setTitle("나의 게시판 화면");
		f.setSize(710, 500);
		
		JLabel l1 = new JLabel("<<<< 게시판 글쓰기 화면 >>>>");
		JLabel l2 = new JLabel("게시판 번호");
		JLabel l3 = new JLabel("게시판 제목");
		JLabel l4 = new JLabel("게시판 내용");
		JLabel l5 = new JLabel("게시판 글쓴이");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		JButton b1 = new JButton("게시판 글쓰기 처리");
		JButton b2 = new JButton("게시판 지우기 처리");
		JButton b3 = new JButton("게시판 수 정 처리");
		JButton b4 = new JButton("게시판 검 색 처리");
		
		//f에 위에 있는 요소들을 add로 붙여주어야하는데,
		//붙이는 순서대로 물흐르듯이 붙여주고 싶음.
		//물흐르듯이 붙여주는 부품이 필요
		FlowLayout flow = new FlowLayout();
		
		//폰트를 설정하기 위해 font부품 필요 
		Font font = new Font("궁서", Font.BOLD, 40);
		
		//////////// 필요한 부품(객체)를 ram에 가져다 놓고, 준비 끝 ///////
		///조립을 시작해보자. ///
		f.setLayout(flow);
		
		f.add(l1);
		f.add(l2); f.add(t1);
		f.add(l3); f.add(t2);
		f.add(l4); f.add(t3);
		f.add(l5); f.add(t4);
		f.add(b1); f.add(b2);
		f.add(b3); f.add(b4);
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		t1.setBackground(Color.yellow);
		t1.setForeground(Color.red);
		t2.setBackground(Color.yellow);
		t2.setForeground(Color.red);
		t3.setBackground(Color.yellow);
		t3.setForeground(Color.red);
		t4.setBackground(Color.yellow);
		t4.setForeground(Color.red);
		
		b1.setBackground(Color.pink); //배경색
		b1.setForeground(Color.blue); //글자색 
		b2.setBackground(Color.pink);
		b2.setForeground(Color.blue);
		b3.setBackground(Color.pink);
		b3.setForeground(Color.blue);
		b4.setBackground(Color.pink);
		b4.setForeground(Color.blue);
		
		f.getContentPane().setBackground(Color.pink);
		
		
		// 버튼에 액션을 추가함
		b4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String str = t1.getText();
				int num = Integer.parseInt(str);
				
				
				System.out.println("입력값 출력 " + num);
				BBSDAO dao = new BBSDAO();
				BbsVO bag = dao.one(num);
				
			
				t1.setText(Integer.toString(bag.getNo()));
				t2.setText(bag.getTitle());
				t3.setText(bag.getContent());
				t4.setText(bag.getWriter());
				
			}
		});
		
		
		f.setVisible(true);
	}
	
	public static void openSignIn() {
		JFrame f = new JFrame();
		
	}
	
}	