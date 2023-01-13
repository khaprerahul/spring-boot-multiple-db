package com.javatechie.springbootmultipledb;

import com.javatechie.springbootmultipledb.model.book.Book;
import com.javatechie.springbootmultipledb.model.book.repository.BookRepository;
import com.javatechie.springbootmultipledb.model.user.User;
import com.javatechie.springbootmultipledb.model.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
public class SpringBootMultipleDbApplication {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMultipleDbApplication.class, args);
    }

    @PostConstruct
    public void addDataToDB() {
        userRepository.saveAll(Stream.of(new User(111, "Rahul"), new User(222, "Rahul1")).collect(Collectors.toList()));
        bookRepository.saveAll(Stream.of(new Book(1, "Core Java"), new Book(222, "Spring Boot")).collect(Collectors.toList()));
    }

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/getBooks")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

}
