package com.multi.mvc2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodController {
	
	@RequestMapping("food")
	public String food(FoodVO bag) {
		
		if(bag.getLike().equals("라면")) {
			return "like";
		} else if(bag.getDislike().equals("커피")) {
			return "dislike";
		} else {
			return "redirect:food.jsp";
		}
	}
}
