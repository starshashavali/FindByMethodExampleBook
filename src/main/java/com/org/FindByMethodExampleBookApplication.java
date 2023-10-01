package com.org;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.org.domain.Book;
import com.org.repo.BookRepo;

@SpringBootApplication
public class FindByMethodExampleBookApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FindByMethodExampleBookApplication.class, args);
		BookRepo repo = context.getBean(BookRepo.class);
		/*
		 * Book book =new Book(101,"Java",99.9); repo.save(book); Book b =new
		 * Book(102,"spring",299.9); repo.save(b); Book b1 =new
		 * Book(103,"Restful",399.9); repo.save(b1); Book b2 =new
		 * Book(104,"python",499.9); repo.save(b2);
		 */

		List<Book> entitis = repo.findByPriceGreaterThanEqual(200.0);
		for (Book b : entitis) {
			System.out.println(b);
		}
		System.out.println("++++++++++++++++++++++");
		List<Book> obj = repo.findByPriceEquals(399.9);
		for(Book b: obj) {
			System.out.println(b);
		}
		Book byName = repo.findByName("spring");
		System.out.println(byName);
	}

}
