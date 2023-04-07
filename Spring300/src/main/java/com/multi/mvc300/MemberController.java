package com.multi.mvc300;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할로 등록! dependency
public class MemberController {
	
	@Autowired
	MemberDAO dao; //전역변수(글로벌 변수) 

	@RequestMapping("insert")
	public void insert(MemberVO bag) {
		dao.insert(bag);
	}
	
	@RequestMapping("update")
	public void update(MemberVO bag) {
		dao.update(bag);
	}
	
	@RequestMapping("delete")
	public void delete(String id) {
		dao.delete(id);
	}
	
	@RequestMapping("one")
	public void one(String id, Model model) {
		System.out.println(id);
		MemberVO bag = dao.one(id);
		
		model.addAttribute("bag", bag);
	}
	
}
