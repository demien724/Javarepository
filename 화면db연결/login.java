package 화면db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class login {
	public int name(String id, String pw) {
		ResultSet rs;
		int result = 0;
		try {
			System.out.println("1. 드라이버 적용");
			Class.forName("oracle.jdbc.driver.OracleDriver");

			
			System.out.println("2. Oracle , JAVA 연결");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";

			Connection con = DriverManager.getConnection(url, user, password);

			System.out.println("3. SQL명령어 입력 ");
			String sql = "SELECT * FROM HR.MEMBER WHERE ID = ? AND PW = ?" ;
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, id);
			ps.setString(2, pw);
			
			
			System.out.println("4. 명령어 실행");
			rs = ps.executeQuery();
			
			if(rs.next()) {
				result =1;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return result;
	}
}
