package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Author;

public interface AuthorRepo extends JpaRepository<Author, Long> {
      Optional<Author> findByEmailAndPassword(String email,String password);

}
