package 화면db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class ExamDAO {
	static private ResultSet rs = null;
	static private String result = null;
	
	public static String pass(String str) {
		try {
			System.out.println("1단계 >> JDBC 드라이버 설치");
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("2단계 >> JAVA ㅡ Oracle 연결");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";

			Connection con = DriverManager.getConnection(url, user, password);
			
			System.out.println("3단계 >> 명령문 작성");
			String sql = "SELECT * FROM HR.EXAM_PASS WHERE CERT_NUM = ?";					// 수험 번호를 통해 해당 학생의 시험 정보를 추출
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, str);
			
			System.out.println("4단계 >> 명령어 실행");
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getString(4));
				result = rs.getString(4);
			} 
			
			else {
				return null;
			}
//			PreparedStatement ps = 
			
			rs.close();
			con.close();
		} 
		catch (Exception e) {
				e.printStackTrace();
		}
		
		return result;
	}

	
	// 데이터 존재 학인
	public static void check(String str) {
		try {
			System.out.println("1단계 >> JDBC 드라이버 설치");
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("2단계 >> JAVA ㅡ Oracle 연결");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";

			Connection con = DriverManager.getConnection(url, user, password);
			
			System.out.println("3단계 >> 명령문 작성");
			String sql = "SELECT * FROM HR.EXAM_PASS WHERE CERT_NUM = ?";					// 수험 번호를 통해 해당 학생의 시험 정보를 추출
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, str);
			
			System.out.println("4단계 >> 명령어 실행");
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getString(4));
				result = rs.getString(4);
			} 
			
			
			
			rs.close();
			con.close();
		} 
		catch (Exception e) {
				e.printStackTrace();
		}
		
	}
}
