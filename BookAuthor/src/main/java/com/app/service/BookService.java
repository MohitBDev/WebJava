package com.app.service;

import java.util.List;

import com.app.dto.AuthorDto;
import com.app.dto.BookDto;
import com.app.entities.Book;

public interface BookService {
	List<Book> getall();
	String addbook(BookDto b);
	String addauthor(AuthorDto a);
	String deletebook(Long id);
	Book getbook(Long id);
	
	String updatebook(BookDto b);
	
	List<Book> getSort(List a);

}
