package com.example;

import com.example.model.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LibraryExploreApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibraryExploreApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Library Name : Central Library");
		System.out.println("Books Available:");
		
		List<Book> books = new ArrayList<>();
		books.add(new Book(101, "Java Programming", "James Gosling", 450.0));
		books.add(new Book(102, "Spring Framework", "Rod Johnson", 550.0));
		
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
