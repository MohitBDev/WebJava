package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Book;

public interface BookRepo extends JpaRepository<Book, Long> {
	
	
	List<Book> findByOrderByCategory(List a);
	 List<Book> findAllOrderByCategoryAsc();
}
