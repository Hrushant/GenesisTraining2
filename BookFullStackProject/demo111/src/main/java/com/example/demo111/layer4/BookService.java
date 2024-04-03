package com.example.demo111.layer4;

import java.util.*;
import org.springframework.stereotype.Service;

import com.example.demo111.layer2.Book;

@Service
public interface BookService {
    public void addBookService(Book book);

    public void removeBookService(Book book);

    public void modifyBookService(Book book);

    Book findBookService(int bookId);

    List<Book> findAllBooksService();
}
