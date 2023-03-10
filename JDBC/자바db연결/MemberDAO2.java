package 자바db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO2 {

	public int delete(String id) {
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			String sql = "delete from hr.member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			System.out.println("3. SQL문 부품(객체)으로 만들어 주기");

			result = ps.executeUpdate();
			
			
			System.out.println("4. SQL문 오라클로 보내기 성공");

			if (result == 1) {
				System.out.println("탈퇴 성공");
			}
			
		} catch (Exception e) {
			// 모든 위험한 상황을 잡음
			e.printStackTrace();
		}
		return result;
	}

	public int update(String tel, String id) {
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			String sql = "update hr.member set tel = ? where id= ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			ps.setString(2, id);

			System.out.println("3. SQL문 부품(객체)으로 만들어 주기");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");

			if (result == 1) {
				System.out.println("전화번호 업데이트 성공!");
			}
		} catch (Exception e) {
			// 모든 위험한 상황을 잡음
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

	public int insert(String id, String pw, String name, String tel) {
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2. JAVA와 ORCLE을 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// 3. JAVA에서 준 값을 ORACLE에서 필요로 하는 모양으로 추가, 변경
			String sql = "insert into hr.MEMBER values (? ,? ,? ,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);

			System.out.println("3. SQL문 부품(객체)으로 만들어 주기");

			// 4. 업데이트를 통해 ORACLE에 결과(업데이트)를 만듬
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");

			if (result == 1) {
				System.out.println("회원가입 성공!");
			}
		} catch (Exception e) {
			// 모든 위험한 상황을 잡음
			e.printStackTrace();
		}

		System.out.println(result);
		return result;

	}
	
	
	/*
	 * 드라이버 설정 → DB연결 → SQL문 객체로 만들고, → 4) SQL문 전송 Data Access Object(DAO) DML -
	 * CRUD - insert, select, update, delete create(insert문)
	 */

}
