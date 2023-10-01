package com.org.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.domain.Book;


public interface BookRepo extends JpaRepository<Book, Integer> {
	
	List<Book> findByPriceGreaterThanEqual(Double price);
	
	List<Book> findByPriceEquals(Double price);
	
	Book findByName(String name);

}
