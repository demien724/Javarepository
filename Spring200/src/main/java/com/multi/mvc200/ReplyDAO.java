package com.multi.mvc200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

//테이블 하나당 DAO하나! ==> CUD를 완성!! 
@Component
public class ReplyDAO {

	
	// 리스트 검색
	public ArrayList<ReplyVO> list(int bbsno) {
		ResultSet rs = null; 

		ArrayList<ReplyVO> list = new ArrayList<ReplyVO>();

		ReplyVO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); 
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from multi.reply where bbsno = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1,bbsno);
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery();
			
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { 
				int no2 = rs.getInt(1); // no
				int bbsno2 = rs.getInt(2);
				String content = rs.getString(3); // content
				String writer = rs.getString(4); // writer
				System.out.println(no2 + " " + bbsno2 + " " + content + " " + writer);

				bag = new ReplyVO();
				bag.setNo(no2);
				bag.setBbsno(bbsno2);
				bag.setContent(content);
				bag.setWriter(writer);

				list.add(bag);
			}
			// System.out.println(result);
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	
	public void insert(ReplyVO bag) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공.");

			String sql = "insert into multi.reply(bbsno, content, writer) values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, bag.getBbsno());
			ps.setString(2, bag.getContent());
			ps.setString(3, bag.getWriter());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");

			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public ArrayList<ReplyVO> list2(String id) {
		ResultSet rs = null; 

		ArrayList<ReplyVO> list = new ArrayList<ReplyVO>();

		ReplyVO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); 
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from multi.member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1,id);
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery();
			
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { 
				int no2 = rs.getInt(1); // no
				int bbsno2 = rs.getInt(2);
				String content = rs.getString(3); // content
				String writer = rs.getString(4); // writer
				System.out.println(no2 + " " + bbsno2 + " " + content + " " + writer);

				bag = new ReplyVO();
				bag.setNo(no2);
				bag.setBbsno(bbsno2);
				bag.setContent(content);
				bag.setWriter(writer);

				list.add(bag);
			}
			// System.out.println(result);
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}


}
