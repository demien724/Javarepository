package com.multi.mvc2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public  class MovieController {
	
	@RequestMapping("GerneChoice")
	public String Gerne(String Movie_Gerne) {
		System.out.println(Movie_Gerne);
		
		if(Movie_Gerne.equals("comedy")) {
			// views/comic.jsp 연결
			return "comedy";
		} else if(Movie_Gerne.equals("drama")) {
			return "drama";
		} else {
			return "action";
		}
		
	}
}
