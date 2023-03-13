package 화면db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExamPassDAO {

	// 수험 결과 확인
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

			if (rs.next()) {

				vo.setCert_Num(rs.getString(1));
				vo.setCert_Name(rs.getNString(2));
				vo.setCert_Day(rs.getString(3));
				vo.setCert_Pass(rs.getInt(4));

//				result = rs.getInt(4);			// 수험 합격 여부
			}

			ps.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return vo;
	}

	
	// 수험생 정보 확인
		public ExamPassVO showInfo(ExamPassVO vo) {
			ResultSet rs = null;
			
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
				ps.setString(1, vo.getCert_Num());
				
				System.out.println("4단계");
				rs = ps.executeQuery();
				
				if(rs.next()) {			
					vo.setCert_Name(rs.getString(2));
					vo.setCert_Day(rs.getString(3));
					vo.setCert_Pass(rs.getInt(4));
				} 
				else {
					vo.setCert_Num(null);
				}

				ps.close();
				con.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			return vo;
		}
	
	
	// 수험 결과 업데이트
	public int updateGrade(ExamPassVO vo) {
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
			ps.setInt(1, vo.getCert_Pass());
			ps.setString(2, vo.getCert_Num());

			System.out.println("4단계");
			ps.executeUpdate();

			if (ps.executeUpdate() == 1) {
				updateResult = 1;
			} else {
				updateResult = 0;
			}

			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return updateResult;
	}

	
	
}
