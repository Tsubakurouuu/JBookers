package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.domain.book.model.Book;

@Mapper
public interface BookMapper {
	public List<Book> findMany();
	
	public Book findOne(String id);
	
	public void updateOne(@Param("id") String id, @Param("title") String title, @Param("body") String body);
	
	public int deleteOne(@Param("id") String id);
}
