package 자바db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB연결테스트2 {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			
			Connection con =	DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");
			
			
			String sql = "insert into hr.BBS values (5, '화요일', '수업', 'apple')";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 부품(객체)으로 만들어 주기");
		
			
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			
			
		} catch (Exception e) {		
			// 모든 위험한 상황을 잡음
			e.printStackTrace();
		}
		
		
//		2. 오라클 11G와 연결해보자 (java -- oracle)
		
	}

}
