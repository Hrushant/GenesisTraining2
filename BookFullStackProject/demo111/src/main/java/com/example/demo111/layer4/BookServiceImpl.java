package com.example.demo111.layer4;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo111.MyExceptions.BookAlreadyExists;
import com.example.demo111.MyExceptions.BookNotFoundException;
import com.example.demo111.layer2.Book;
import com.example.demo111.layer3.BookRepository;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public void addBookService(Book bookobj) {
        Optional<Book> book2 = bookRepository.findById(bookobj.getBookId());
        if (book2.isPresent()) {
            throw new BookAlreadyExists("Book already exists...");
        } else {
            bookRepository.save(bookobj);
            System.out.println("Book added successfully...");
        }
    }

    @Override
    public void removeBookService(Book bookObj) {
        Optional<Book> book2 = bookRepository.findById(bookObj.getBookId());
        if (book2.isPresent()) {
            bookRepository.delete(bookObj);
            System.out.println("Book deleted successfully...");
        } else {
            throw new BookNotFoundException("Book not found...");
        }
    }

    @Override
    public void modifyBookService(Book bookobj) {
        Optional<Book> book2 = bookRepository.findById(bookobj.getBookId());
        if (book2.isPresent()) {
            bookRepository.save(bookobj);
            System.out.println("Book modified successfully...");
        } else {
            throw new BookNotFoundException("Book not found...");
        }
    }

    @Override
    public Book findBookService(int bookId) {
        Book book3 = null;
        Optional<Book> book = bookRepository.findById(bookId);
        if (book.isPresent()) {
            book3 = book.get();
            System.out.println("Book found...");
        } else {
            throw new BookNotFoundException("Book does not found...");
        }
        return book3;
    }

    @Override
    public List<Book> findAllBooksService() {
        List<Book> bList = (List<Book>) bookRepository.findAll();
        return bList;
    }
}
