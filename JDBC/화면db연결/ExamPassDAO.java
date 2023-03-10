package 화면db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExamPassDAO {
	
	
	public ExamPassVO checkGrade(String Cert_Num) {
		ResultSet rs = null;
		ExamPassVO vo = new ExamPassVO();
//		int result = 10;
		try {
			System.out.println("1단계");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("2단계");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			
			
			
			System.out.println("3단계");
			String sql = "SELECT * FROM HR.EXAM_PASS WHERE CERT_NUM = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, Cert_Num);
			
			System.out.println("4단계");
			rs = ps.executeQuery();
			
			
			
			if(rs.next()) {
				
				vo.setCert_Num(rs.getString(1));
				vo.setCert_Name(rs.getNString(2));
				vo.setCert_Day(rs.getString(3));
				vo.setCert_Pass(rs.getInt(4));
				
//				result = rs.getInt(4);			// 수험 합격 여부
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return vo;
	}

	
	// certNum 수험 번호
	// radioboxNum은 합격, 불합격, 처리중의 여부
	public int updateGrade(String certNum, int radioboxNum) {
		
		// 결과로 넘기는 것
		int updateResult = 0;
		try {
			
			System.out.println("1단계");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("2단계");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			System.out.println("3단계");
			String sql = "UPDATE HR.EXAM_PASS SET CERT_PASS = ? WHERE CERT_NUM = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, radioboxNum);
			ps.setString(2, certNum);
			
			
			System.out.println("4단계");
			ps.executeUpdate();
			
			if(ps.executeUpdate() == 1) {
				updateResult = 1;
			} 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return updateResult;
	}
}
