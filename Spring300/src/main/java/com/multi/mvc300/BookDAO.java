package com.multi.mvc300;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public int insert(BookDTO bag) {
		System.out.println(bag.toString());
		int result = my.insert("book.create", bag);
		
		System.out.println(result);
		return result;
	}

	
	public int delete(String name) {
		System.out.println(name);
		int result = my.delete("book.del", name);

		return result;
	}

	
	public int update(BookDTO bag) {
		System.out.println(bag.toString());
		int result = my.update("book.up", bag);

		return result;
	}

	
	
	public BookDTO one(String name) {
		BookDTO bag = my.selectOne("book.one", name);
		
		return bag;
	}

	
	public List<BookDTO> list() {
		List<BookDTO> list = my.selectList("book.all");
		

		return list;
	}
	
}
