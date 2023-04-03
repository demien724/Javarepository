package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@RequestMapping("movie")
	public void com(MovieVO vo, Model model) {
		System.out.println(vo);

		model.addAttribute("vo", vo);
	}

	@RequestMapping("tour")
	public void tour(Model model) {
		ArrayList<String> tourList = new ArrayList<String>();

		tourList.add("미국");
		tourList.add("일본");
		tourList.add("서울");

		model.addAttribute("list", tourList);
	}

	@RequestMapping("fruit")
	public void fruit(Model model) {
		ArrayList<String> fruitList = new ArrayList<String>();

		fruitList.add("사과");
		fruitList.add("수박");
		fruitList.add("멜론");

		model.addAttribute("list", fruitList);
	}
}
