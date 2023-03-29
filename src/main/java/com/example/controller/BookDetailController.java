package com.example.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.domain.book.model.Book;
import com.example.domain.book.service.BookService;
import com.example.form.BookEditForm;

@Controller
public class BookDetailController {
	@Autowired
	private BookService bookService;
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/book/{id}")
	public String getBook(Model model, @PathVariable("id") String id) {
		Book bookShow = bookService.getBookOne(id);
		model.addAttribute("bookShow", bookShow);
		return "show";
	}
	
	@GetMapping("/book/{id}/edit")
	public String edit(Model model, @PathVariable("id") String id) {
		Book bookEdit = bookService.getBookOne(id);
		model.addAttribute("bookEdit", bookEdit);
		return "edit";
	}
	
	@PostMapping(value = "/book", params = "update")
	public String updateBook(BookEditForm form, Model model) {
		bookService.updateBookOne(form.getId(), form.getTitle(), form.getBody());
		return "redirect:/show";
	}
	
	@PostMapping(value = "/book", params = "delete")
	public String deleteBook(BookEditForm form, Model model) {
		bookService.deleteBookOne(form.getId());
		return "redirect:/index";
	}
}
