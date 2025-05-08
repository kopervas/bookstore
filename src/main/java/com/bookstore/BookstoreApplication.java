package com.bookstore;

import com.bookstore.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
        Book bibel = new Book();
        bibel.setTitle("Bibel");
        System.out.println("Bibel Id = " + bibel.getId());
        System.out.println("Bibel costs = " + bibel.getPrice() + "\n");
        System.out.println("Final");
    }
}
