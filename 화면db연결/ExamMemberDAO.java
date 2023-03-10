package 화면db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExamMemberDAO {
	
	public ExamMemberVO login(String id, String pw) {
		ResultSet rs = null;
		ExamMemberVO vo = new ExamMemberVO();;
		
		try {
			System.out.println("1단계");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("2단계");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			
			System.out.println("3단계");
			String sql = "SELECT * FROM HR.EXAM_MEMBER WHERE ID = ? AND PW = ?";			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, id);
			ps.setString(2, pw);
			
			rs = ps.executeQuery();
			
			System.out.println("4단계");
			
			if(rs.next()) {
				System.out.println("로그인 확인");
				vo.setID(rs.getString(1));
				vo.setPW(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setTel(rs.getString(4));
				vo.setRRN(rs.getString(5));
			} else {
				System.out.println("로그인 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return vo;
	}
}
