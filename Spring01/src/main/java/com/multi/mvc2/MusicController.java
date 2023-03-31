package com.multi.mvc2;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MusicController {

	@Autowired
	MusicDAO dao;

	@RequestMapping("one.Music")
	public String one(String id, Model model) {
		System.out.println("request mapping confirm >> one.Music");
		MusicDTO bag = dao.one(id);

		if (bag != null) {
			System.out.println("확인?");
			model.addAttribute("result", bag);
			return "oneMusic";
		} else {
			return "redirect:music.jsp";
		}
	}
	
	
	@RequestMapping("listMusic")
	public void list(Model model) {
		System.out.println("request mapping confirm >> list.Music");	// 매핑 확인용
		
		ArrayList<MusicDTO> list = dao.list();
		model.addAttribute("list", list);
		
	}
}
