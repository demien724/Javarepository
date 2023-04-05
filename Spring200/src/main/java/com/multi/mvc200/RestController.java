package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
	
	@RequestMapping("json1")
	@ResponseBody	// 요청을 받으면 return되는 데이터를 JSON으로 만들어서 요청하는 곳으로 다시 보냄
	public MemberVO json1() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");
		return bag;
	}
	
	@RequestMapping("json2")
	@ResponseBody	// 요청을 받으면 return되는 데이터를 JSON으로 만들어서 요청하는 곳으로 다시 보냄
	public ArrayList<MemberVO> json2() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");
		
		MemberVO bag2 = new MemberVO();
		bag2.setId("root2");
		bag2.setPw("12342");
		bag2.setName("hong2");
		bag2.setTel("0112");

		ArrayList<MemberVO> list= new ArrayList<MemberVO>();
		list.add(bag);
		list.add(bag2);
		
		return list;
	}
	
	@RequestMapping("json3")
	@ResponseBody	// 요청을 받으면 return되는 데이터를 JSON으로 만들어서 요청하는 곳으로 다시 보냄
	public MemberVO json3() {
		MemberVO bag = new MemberVO();
		bag.setId("test");
		bag.setPw("testPassword");
		bag.setName("Tester");
		bag.setTel("000");
		return bag;
	}
	
	@RequestMapping("json4")
	@ResponseBody	// 요청을 받으면 return되는 데이터를 JSON으로 만들어서 요청하는 곳으로 다시 보냄
	public ArrayList<MemberVO> json4() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");
		
		MemberVO bag2 = new MemberVO();
		bag2.setId("root2");
		bag2.setPw("12342");
		bag2.setName("hong2");
		bag2.setTel("0112");

		ArrayList<MemberVO> list= new ArrayList<MemberVO>();
		list.add(bag);
		list.add(bag2);
		
		return list;
	}
}
