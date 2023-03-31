package com.multi.mvc2;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	// 스프링에서 제어하는 역할로 등록
public class BbsController {

	@Autowired
	BbsDAO dao;
	// 컨트롤 할 기능(Crud)
	// 회원가입, 수정, 탈퇴, 정보검색
	
	// 요청 브라우저에서의 action="Request.jsp"와
	// Mapping.jsp파일의 이름은 같아야합니다.
	
	@RequestMapping("insert2.multi")
	public void insert(BbsVO bag) {
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
		System.out.println(dao.toString());
		
		dao.insert(bag);
	}
	
	@RequestMapping("update2.multi")
	public void update(BbsVO bag) {
		System.out.println("Update 요청됨");
		System.out.println(bag);
		System.out.println(dao.toString());
		
		dao.update(bag);
	}
	
	@RequestMapping("delete2.multi")
	public void delete(int no) {
		System.out.println("Delete 요청됨");
		System.out.println(dao.toString());
		
		dao.delete(no);
	}
	
	@RequestMapping("one2.multi")
	public String one(int no,Model model) {
		System.out.println("Search a Document Info");
		System.out.println(dao.toString());
		
		BbsVO bag = dao.one(no);
		
		if(bag == null) {
			return "redirect:bbs.jsp";
		}
		else {
			model.addAttribute("bag ", bag);
			return "one2";
		}
	}
	
	@RequestMapping("list2.multi")
	public void list(Model model) {
		System.out.println("Search All Bbs Info << 1번째 실행");
		ArrayList<BbsVO> list = dao.list();

		System.out.println("list를 추출 << 2번째 실행");
		
		// 
		model.addAttribute("list2", list);
	}
	
	
}
