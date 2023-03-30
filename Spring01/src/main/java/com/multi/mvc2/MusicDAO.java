package com.multi.mvc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class MusicDAO {
	public MusicDTO one(String id) {
		ResultSet rs = null;

		MusicDTO result = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. 오라클 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://wwww.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!!

			String sql = "select * from multi.music where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");

			if (rs.next()) {
				result = new MusicDTO();
				result.setId(rs.getString(1));
				result.setName(rs.getString(2));
				result.setSinger(rs.getString(3));
				result.setGenre(rs.getString(4));
				result.setAlbum(rs.getString(5));
			} else {
				System.out.println("not Find");
			}
		} catch (Exception e) {

		}

		return result;
	}

	public ArrayList<MusicDTO> list() {
		ResultSet rs = null;

		ArrayList<MusicDTO> result = new ArrayList<MusicDTO>();
		MusicDTO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. 오라클 연결 성공.");

			String sql = "select * from multi.music";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");

			int i = 0;
			while(rs.next()) {
				bag = new MusicDTO();
				bag.setId(rs.getString(1));
				bag.setName(rs.getString(2));
				bag.setSinger(rs.getString(3));
				bag.setGenre(rs.getString(4));
				bag.setAlbum(rs.getString(5));
				System.out.println(++i);
				
				result.add(bag);
			}
		} catch (Exception e) {

		}

		return result;
	}
}
