package com.multi.mvc2;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	// 스프링에서 제어하는 역할로 등록
public class MemberController {
	
	// MeberDAO의 싱글톤 객체 ram의 어디에 있는지 찾아서 그 주소 아래 변수를 넣어주세요	
	@Autowired
	MemberDAO dao;
	
	
	// 컨트롤 할 기능(Crud)
	// 회원가입, 수정, 탈퇴, 정보검색
	
	
	@RequestMapping("login")
	public String login(MemberVO bag) {
//		System.out.println(bag);
		int result = dao.login(bag);
		if(result == 1) {
			return "ok";
		} else {
//			return "no";
			// 	views 아래가 아닌 webapp 아래로
			// member.jsp로 가고싶은 경우 redirect 를 사용합니다.
			
			return "redirect:member.jsp";
			
		}
		
		
	}
	
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
	public void list(Model model) {
		System.out.println("Search All Users Info");
		
		ArrayList<MemberVO> list = dao.list();
		model.addAttribute("list",list);
		
	}
}
