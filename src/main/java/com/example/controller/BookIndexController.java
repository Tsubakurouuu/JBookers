package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.domain.book.model.Book;
import com.example.domain.book.service.BookService;

@Controller
public class BookIndexController {
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public String index(Model model) {
		List<Book> bookIndex = bookService.getBooks();
		model.addAttribute("bookIndex", bookIndex);
		return "index";
	}
}
