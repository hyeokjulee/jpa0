package me.hyeokju.demojpa;

import me.hyeokju.demojpa.book.Book;
import me.hyeokju.demojpa.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BookRunner implements ApplicationRunner {

    @Autowired
    BookRepository bookRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Book book = new Book();
        book.setName("Whiteship's JPA");
        book.setCreated(new Date());

        bookRepository.save(book);
    }
}
