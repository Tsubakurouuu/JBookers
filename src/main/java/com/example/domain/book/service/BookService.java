package com.example.domain.book.service;

import java.util.List;

import com.example.domain.book.model.Book;

public interface BookService {
	public List<Book> getBooks();
	
	public Book getBookOne(String id);
	
	public void updateBookOne(String id, String title, String body);
	
	public void deleteBookOne(String id);
}
