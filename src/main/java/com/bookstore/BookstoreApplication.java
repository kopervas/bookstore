package com.bookstore;

import com.bookstore.model.Book;
import com.bookstore.service.BookService;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookstoreApplication {
    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Book bible = new Book();
                bible.setTitle("Bible");
                bible.setAuthor("Godfather");
                bible.setIsbn("122345678");
                bible.setPrice(BigDecimal.valueOf(100));

                bookService.save(bible);
                List<Book> list = bookService.getAll();
                Book test = list.stream().filter(book -> book.getTitle().equals("Bible"))
                        .findFirst().orElseThrow();
                System.out.println("Test Book id = " + test.getId());
                System.out.println("Test Book titel = " + test.getTitle());
                System.out.println("Test Book author = " + test.getAuthor());
                System.out.println("Test Book isbn = " + test.getIsbn());
                System.out.println("Test Book price = " + test.getPrice());
            }
        };
    }
}
