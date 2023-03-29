package com.multi.mvc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Component;


@Component
public class BookDAO {

	public int insert(BookDTO bag) {
		int result = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			String sql = "insert into multi.book values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, bag.getId()); // ps.setInt(1, no);
			ps.setString(2, bag.getName());
			ps.setString(3, bag.getUrl());
			ps.setString(4, bag.getImg());

			result = ps.executeUpdate();
			if (result == 1) {
				System.out.println("Insert Complete");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

		return result;
	}

	public int delete(String name) {
		int result = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			String sql = "delete from multi.book where name = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name); // ps.setInt(1, no);
			

			result = ps.executeUpdate();
			if (result == 1) {
				System.out.println("Insert Complete");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

		return result;
	}

	public BookDTO one(String name) {
		ResultSet rs = null;
		
		BookDTO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			String sql = "select * from multi.book where name = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name); // ps.setInt(1, no);
			
			rs = ps.executeQuery();
			
			if (rs.next()) {
				bag = new BookDTO();
				bag.setId(rs.getInt(1));
				bag.setName(rs.getString(2));
				bag.setUrl(rs.getString(3));
				bag.setImg(rs.getString(4));
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

		return bag;
	}

	public int update(BookDTO bag) {
		int result = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			String sql = "update multi.book set url = ? where name = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getUrl());
			ps.setString(2, bag.getName()); 
			

			result = ps.executeUpdate();
			if (result == 1) {
				System.out.println("UpdateComplete");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

		return result;
	}
}
