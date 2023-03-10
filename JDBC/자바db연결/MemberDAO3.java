package 자바db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import 화면db연결.MemberVO;

public class MemberDAO3 {

	public int delete(MemberVO bag) {
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
			ps.setString(1, bag.getId());

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

	public int update(MemberVO bag) {
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
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getId());

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

	public int insert(MemberVO bag) {
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
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());

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

	public MemberVO one(String id) {
		/*	
		 * resultSet, 	참조형 변수
		 * 					속성 이름 + 결과를 담고 있는 테이블
		 * 					null을 통해 주소가 없다고 초기화
		 * 
		 * 					단, select를 통해 나온 테이블에 데이터(행)가 없어도
		 * 					그 결과는 Null이 아님
		 */
		ResultSet rs = null;
		MemberVO bag = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			String sql = "select * from hr.MEMBER where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			System.out.println("3. SQL문 부품(객체)으로 만들어 주기");

			rs = ps.executeQuery(); // select문 전송시에는

			System.out.println("4. SQL문 오라클로 보내기 성공");

			/*
			 * 검색결과의 유무는 rs.next() 로 확인합니다
			 * 검색된 행이 있으면 true, 없으면 false
			 */
			
			if (rs.next()) {			
				System.out.println("검색 결과 있음");
				
				String id2 = rs.getString(1);
				String pw2 = rs.getString(2);
				String name2 = rs.getString(3);
				String tel2 = rs.getString(4);
				
				System.out.println(id2 + " , " + pw2 + " , " + name2 + " , " + tel2);
				
				bag = new MemberVO();
				bag.setId(id2);
				bag.setPw(pw2);
				bag.setName(name2);
				bag.setTel(tel2);
			}

		} catch (Exception e) {
			// 모든 위험한 상황을 잡음
			e.printStackTrace();
		}
		
		
		return bag;
	}

	public ArrayList<MemberVO> list() {
		ResultSet rs = null; //항목명 + 결과 데이터를 담고 있는 테이블 
		
		//가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		//ArrayList<MemberVO> ==> MemberVO만 들어간 arraylist라는 의미
		ArrayList<MemberVO> list = new ArrayList<>();
		
		MemberVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!!
			
			String sql = "select * from hr.MEMBER";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			//삭제!!!! ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery(); //select문 전송시  
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while(rs.next()) { //검색결과가 있는지 여부는 rs.next() 
				//true이면 있다라는 의미, false이면 없다라는 의미 
				//1. 검색겨로가가 있으면, 
				System.out.println("검색결과 있음. 성공.");
				//2. 각 컬럼에서 값들을 꺼내오자. 
				String id2 = rs.getString(1); //id
				String pw = rs.getString("pw"); //pw
				String name = rs.getString(3); //name
				String tel = rs.getString(4); //tel
				System.out.println(	id2 + " " 
									+ pw + " " 
									+ name + " " 
									+ tel);
				//검색결과를 검색화면 UI부분을 주어야 함.
				//3. 가방을 만들자.
				bag = new MemberVO();
				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				
				//4. list에 bag을 추가해주자.
				list.add(bag);
			}
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//return id, pw, name, tel은 XXXXX!
		//return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함.
		//검색결과가 있을 때는 bag에 데이터가 들어있음. 
		//검색결과가 없을 때는 bag에 무엇이 들어있나? null
		return list;
		
	}
	/*
	 * 드라이버 설정 → DB연결 → SQL문 객체로 만들고, → 4) SQL문 전송 Data Access Object(DAO) DML -
	 * CRUD - insert, select, update, delete create(insert문)
	 */

}
