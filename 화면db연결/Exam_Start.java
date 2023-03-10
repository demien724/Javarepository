package 화면db연결;


import javax.swing.JOptionPane;

public class Exam_Start {
	public static void main(String[] args) {
			String id = JOptionPane.showInputDialog("ID");
			String pw = JOptionPane.showInputDialog("pw");
			
			
			
			// 검색
			ExamMemberDAO examMember = new ExamMemberDAO();
			ExamMemberVO loginMember = examMember.login(id, pw);
			
			if(loginMember.getID() != null && loginMember.getPW() != null) {
				Exam_Main index = new Exam_Main();
				index.OpenIndex(loginMember);
			}

		
		
//		pass.Confirm(resultID);
	}
}
