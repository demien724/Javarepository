package 화면db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginExam {
	 
	
	public static ExamMemberVO check(String id, String pw) {		// 로그인을 하기위해 넣은 ID, PW의 유무를 확인합니다.
		ResultSet rs = null;
		ExamMemberVO result = null;
		try {
			System.out.println("step 1");
			Class.forName("oracle.jdbc.OracleDriver");
		
			System.out.println("step 2");			
			String url = "jdbc:oracle:thin:@//localhost:1521/xe";
			String user = "system";
			String password = "oracle";
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			/*
			 * 명령문 부분
			 */
			System.out.println("step 3");
			String sql = "SELECT * FROM HR.EXAM_MEMBER WHERE id = ? AND pw = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			
			System.out.println("step 4");
			rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("로그인 성공");
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
				
			} else {
				System.out.println("로그인 실패");
				result = null;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
