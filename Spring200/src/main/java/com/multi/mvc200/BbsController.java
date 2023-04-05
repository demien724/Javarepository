package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 스프링에서 제어하는 역할로 등록!
public class BbsController {

	@Autowired
	BbsDAO dao;

	@Autowired
	ReplyDAO dao2;

	@RequestMapping("insert2.multi")
	public void insert(BbsVO bag, BbsDAO dao) {
		// 메서드의 입력변수(파라메터)로 변수를
		// 선언해두면, 컨트롤러내의 메서드내에서는
		// 1)bag을 만들어서
		// 2)클라이언트로 부터 전달된 데이터도 받아줌.
		// 3)bag에 데이터 다 넣어줌.
		System.out.println("insert요청됨.");
		System.out.println(bag);

		// dao에게 insert요청!!
		dao.insert(bag);
	}

	@RequestMapping("update2.multi")
	public void update(BbsVO bag, BbsDAO dao) {
		System.out.println("update요청됨.");
		System.out.println(bag);
		dao.update(bag);
	}

	@RequestMapping("delete2.multi")
	public void delete(int no) {
		System.out.println("delete요청됨.");
		System.out.println(no);
		dao.delete(no);
	}

	@RequestMapping("one2.multi")
	public void one(int no, Model model) {
		System.out.println("one요청됨.");
		System.out.println(no);
		BbsVO bag = dao.one(no);
		// 검색결과가 있는지 프린트!
		System.out.println(bag);

		// 댓글 불러오기
		ArrayList<ReplyVO> list = dao2.list(no);

		model.addAttribute("bag", bag);
		model.addAttribute("list", list);
	}

	@RequestMapping("list2")
	public void list(Model model) {
		ArrayList<BbsVO> list = dao.list();
		System.out.println(list.size()); // 사이즈를 찍어보세요.
		model.addAttribute("list", list);
	}

	@RequestMapping("list5")
	public void list5(Model model) {
		ArrayList<BbsVO> list = dao.list();
		System.out.println(list.size()); // 사이즈를 찍어보세요.
		model.addAttribute("list", list);
	}

	@RequestMapping("one22")
	@ResponseBody
	// views로 넘어가지 않고,
	// Return값이 bag데이터를 json으로 만들어서 클라이언트로 전송
	// 클라이언트 브라우저에서는 success: function(x)
	// 결과과 함수의 입력변수인 x로 쏙 들어간다.!
	public BbsVO one22(int no) {
		System.out.println("one22 요청됨");
		System.out.println(no);

		BbsVO bag = dao.one(no);

		System.out.println(bag);

		return bag;
	}
	
	@RequestMapping("list55")
	@ResponseBody
	public ArrayList<BbsVO> list55() {
		ArrayList<BbsVO> list = dao.list();
		System.out.println(list.size()); 
		return list;
	}

	@RequestMapping("one6")
	public void one6(int no, Model model) {
		BbsVO bag = dao.one(no);
		// 검색결과가 있는지 프린트!
		System.out.println(bag);

		// 댓글 불러오기
		ArrayList<ReplyVO> list = dao2.list(no);

		model.addAttribute("bag", bag);
	}

	@RequestMapping("update3.multi")
	public String update3(int no, String content) {
		System.out.println(no + " " + content);
		int result = dao.update(no, content);

		if (result == 1) {
			return "redirect:ajax_new.jsp";
		} else {
			return null;
		}
	}

	@RequestMapping("jsonResponse3")
	@ResponseBody
	public BbsVO jsonResponse3(int no) {
		System.out.println("mapping Confirm - jsonResponse3");
		BbsVO bag = dao.one(no);
		
		return bag;
	}
	
	@RequestMapping("jsonResponse4")
	@ResponseBody
	public ArrayList<BbsVO> jsonResponse4() {
		System.out.println("mapping Confirm - jsonResponse4");
		ArrayList<BbsVO> list = dao.list();
		
		return list;
	}

	@RequestMapping("jsonResponse5")
	@ResponseBody
	public MapVO jsonResponse5() {
		System.out.println("mapping Confirm - jsonResponse5");
		MapVO bag = new MapVO();
		bag.setLat(35.5117);
		bag.setLon(127.0592);
				
		return bag;
	}
	
}
