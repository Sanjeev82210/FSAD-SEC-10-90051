package com.example.bookstore;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bookstore.entity.Book;
import com.example.bookstore.repository.BookRepository;

@SpringBootApplication
public class BookstoreAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookstoreAppApplication.class, args);
    }

    @Bean
    CommandLineRunner run(BookRepository repo) {
        return args -> {
            String isbn = "9780134685991";

            Optional<Book> book = repo.findById(isbn);

            if (book.isPresent()) {
                Book b = book.get();
                System.out.println("Book Found");
                System.out.println("ISBN: " + b.getIsbn());
                System.out.println("Title: " + b.getTitle());
                System.out.println("Author: " + b.getAuthor());
                System.out.println("Price: " + b.getPrice());
            } else {
                System.out.println("Book not found");
            }
        };
    }
}
