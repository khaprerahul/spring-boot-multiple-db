package com.javatechie.springbootmultipledb.model.book.repository;

import com.javatechie.springbootmultipledb.model.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
