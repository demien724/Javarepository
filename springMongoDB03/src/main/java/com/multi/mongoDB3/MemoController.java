package com.multi.mongoDB3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemoController {
	
	@Autowired
	MemoDAO dao;
	
	@RequestMapping("list.memo")
	public void list(Model model) {
		// DAO의 list()해서 결과 받아오면 됨.
		// 결과 받아온 것을 model의 속성을 지정해서 views까지 검색 결과를 보내자.
		
		
	}
	
}
