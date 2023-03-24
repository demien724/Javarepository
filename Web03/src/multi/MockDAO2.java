package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class MockDAO2 { // CRUD
	public int insert(MockVO2 bag) {
		// 1. 가방을 받아서 변수에 넣어주세요.
		int result = 0;

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
//			System.out.println("2. mySQL 연결 성공.");


			String sql = "insert into multi.mock2 values (?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement

			
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getEmail());
			ps.setString(3, bag.getPhone());
			ps.setString(4, bag.getLast_name());
			ps.setString(5, bag.getFirst_name());

			
//			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			result = ps.executeUpdate(); // 1
//			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
//				System.out.println("회원가입 성공!");
			}
			
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

//		System.out.println(result);
		return result;
	}
}