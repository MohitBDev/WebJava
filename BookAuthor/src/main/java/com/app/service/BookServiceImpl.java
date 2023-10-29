package com.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.ResourceNotFound;
import com.app.dto.AuthorDto;
import com.app.dto.BookDto;
import com.app.entities.Author;
import com.app.entities.Book;
import com.app.repository.AuthorRepo;
import com.app.repository.BookRepo;

@Service
@Transactional
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepo brepo;
	@Autowired
	private AuthorRepo arepo;
	@Autowired
	private ModelMapper mapper;

	@Override
	public List<Book> getall() {
		
		return brepo.findAll().stream().sorted((p,q)->p.getCategory().compareTo(q.getCategory()))
				
				.collect(Collectors.toList());
	}

	@Override
	public String addbook(BookDto b) {
		String msg="Invalid Book ";
		Book b1=mapper.map(b, Book.class);
		Author a=arepo.findById(b.getAuthorid()).orElseThrow(()-> new ResourceNotFound("Indvalid author id"));
		brepo.save(b1);
		a.addbook(b1);
		msg=" Book  Added";
		return msg;
	}

	
	public String addauthor(AuthorDto a) {
		String msg="Invalid Author ";
		Author a1=mapper.map(a, Author.class);
		arepo.save(a1);
		msg=" Author Added ";
		
		return msg;
	}

	@Override
	public String deletebook(Long id) {
		String msg="Invalid Book id ";
		

		brepo.deleteById(id);
		msg=" Book deleted  with id "+id;
		
		return msg;
	}

	@Override
	public Book getbook(Long id) {
		
		return brepo.findById(id).orElseThrow();
	}

	@Override
	public String updatebook(BookDto b) {
		String msg="Invalid Book ";
		//Book b1=mapper.map(b, Book.class);
		Book b1 =brepo.findById(b.getBid()).orElseThrow();
		Author a1=arepo.findById(b.getAuthorid()).orElseThrow();
		a1.addbook(b1);
		b1.setPrice(b.getPrice());
		
		//brepo.save(b1);
		
		
		msg=" Book  Updated";
		return msg;
	}

	@Override
	public List<Book> getSort(List a) {
		// TODO Auto-generated method stub
		List<Book> b =new ArrayList();
		//a.stream().sorted((a1,b1)->a1.ge)
		return null;
	}
	
	
	

}
