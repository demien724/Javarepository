package com.multi.mvc300;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

	@Autowired
	BookDAO dao;

	@RequestMapping("bookInsert")
	public String bookInsert(BookDTO bag) {
		System.out.println("Mapping Confirm");
		int result = dao.insert(bag);

		if (result == 1) {
			return "bookInsert";
		} else {
			return "redirect:book.jsp";
		}

	} // bookInsert

	@RequestMapping("bookUpdate")
	public String bookUpdate(BookDTO bag) {
		System.out.println("Mapping Confirm");

		int result = dao.update(bag);

		if (result == 1) {
			return "bookUpdate";
		} else {
			return "redirect:book.jsp";
		}
	} // bookSearch One

	@RequestMapping("bookDelete")
	public String bookDelete(String name) {
		System.out.println("Mapping Confirm");
		int result = dao.delete(name);

		if (result == 1) {
			return "bookDelete";
		} else {
			return "redirect:book.jsp";
		}

	} // bookInsert

	@RequestMapping("bookSearch")
	public String bookSearch(String name, Model model) {
		System.out.println("Mapping Confirm");

		if (name.equals("")) {
			return "redirect:book.jsp";
		}

		
		// 이름으로 북마크 검색
		BookDTO bag = dao.one(name);

		if (bag == null) {
			return "redirect:book.jsp";
		} else {
			model.addAttribute("bag", bag);
			return "bookSearch";
		}
	}

	@RequestMapping("bookList")
	public void bookList(Model model) {
		System.out.println("Mapping Confirm Book List");

		List<BookDTO> list = dao.list();
		model.addAttribute("list", list);
	}

}
