package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.dto.AuthorDto;
import com.app.dto.BookDto;
import com.app.entities.Book;
import com.app.service.BookService;



@RestController
@RequestMapping("/books")

public class BookController {
	@Autowired
	private BookService ser;
	@GetMapping
	public List<Book> getall(){
		List<Book> b=ser.getall();
		//b.stream().sorted((a,c)->(a.getCategory().equals(c.getCategory())));
		return b;
		
	}
	@PostMapping
	public ApiResponse addBook(@RequestBody BookDto b) {
		return new ApiResponse(ser.addbook(b));
		
	}
	@PostMapping("/author")
	public ApiResponse addBook(@RequestBody AuthorDto a) {
		return new ApiResponse(ser.addauthor(a));
		
	}
	@PutMapping
	public ApiResponse updateBook(@RequestBody BookDto b) {
		return new ApiResponse(ser.updatebook(b));
		
	}
	@GetMapping("/book/{bid}")
	public Book getbook(@PathVariable Long bid) {
		return ser.getbook(bid);
	}
	@DeleteMapping("/delete/{bid}")
	public ApiResponse deletebook(@PathVariable Long bid) {
		return new ApiResponse(ser.deletebook(bid));
	}
	
	

}
