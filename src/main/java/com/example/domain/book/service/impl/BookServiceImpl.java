package com.example.domain.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.book.model.Book;
import com.example.domain.book.service.BookService;
import com.example.repository.BookMapper;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookMapper mapper;

	@Override
	public List<Book> getBooks() {
		return mapper.findMany();
	}

	@Override
	public Book getBookOne(String id) {
		return mapper.findOne(id);
	}

	@Override
	public void updateBookOne(String id, String title, String body) {
		mapper.updateOne(id, title, body);
	}

	@Override
	public void deleteBookOne(String id) {
		int count = mapper.deleteOne(id);
	}
}
	
	
