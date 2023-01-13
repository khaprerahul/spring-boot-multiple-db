package com.javatechie.springbootmultipledb.model.book;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BOOK_TABLE")
public class Book {
    @Id
    private int id;
    private String name;
}
