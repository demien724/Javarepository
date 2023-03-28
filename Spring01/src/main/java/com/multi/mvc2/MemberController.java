package com.multi.mvc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	// 스프링에서 제어하는 역할로 등록
public class MemberController {
	
	// 자동으로 연결해주는 문법
	@Autowired
	MemberDAO dao;
	
	
	// 컨트롤 할 기능(Crud)
	// 회원가입, 수정, 탈퇴, 정보검색
	
	
	@RequestMapping("insert")
	public void insert(MemberVO bag) {
		/*
		 * 메서드의 입력변수로 변수를
		 * 선언해두면 컨트롤러내의 메서드 내에서는
		 * 
		 * 1) Bag을 만들어서
		 * 2) 클라이언트로부터 전달된 데이터도 받아줌
		 * 3) bag에 데이터 다 넣어줌
		 */
		
		System.out.println("Insert 요청됨");
		System.out.println(bag);
		
		// VO뿐만 아니라, DAO역시 매개변수로 자동으로 불러오고 생성해줄수 있다.
		dao.insert(bag);
		
	}
	
	@RequestMapping("update")
	public void update(MemberVO bag) {
		System.out.println("Update 요청됨");
		System.out.println(bag);
		
		dao.update(bag);
	}
	
	@RequestMapping("delete")
	public void delete(String id) {
		System.out.println("Delete 요청됨");
		System.out.println(id);
		
		dao.delete(id);
	}
	
	@RequestMapping("one")
	public void one(String id) {
		System.out.println("Search a User Info");
		System.out.println(id);
		
		dao.one(id);
	}
	
	@RequestMapping("list")
	public void list(MemberVO bag) {
		System.out.println("Search Users Info");
		System.out.println(bag);
	}
}