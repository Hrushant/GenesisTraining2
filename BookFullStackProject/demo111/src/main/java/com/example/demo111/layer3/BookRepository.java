package com.example.demo111.layer3;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo111.layer2.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

}
