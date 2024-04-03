package com.example.demo111.layer5;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo111.layer2.Book;
import com.example.demo111.layer4.BookService;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {
    @Autowired
    BookService bookService;

    // Gettinmg all the records
    @GetMapping("/getall")
    public List<Book> showAllBooks() {
        return bookService.findAllBooksService();
    }

    // Getting single record
    @GetMapping("/{num}")
    public ResponseEntity showSingleBook(@PathVariable("num") int x) {
        try {
            Book book = bookService.findBookService(x);
            return ResponseEntity.status(HttpStatus.OK).body(book);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @PostMapping("/add")
    public ResponseEntity<String> addBook(@RequestBody Book book) {
        try {
            bookService.addBookService(book);
            return ResponseEntity.status(HttpStatus.OK).body("Book is Accepted");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateBook(@RequestBody Book book) {
        try {
            bookService.modifyBookService(book);
            return ResponseEntity.status(HttpStatus.OK).body("Book is modified...");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @DeleteMapping("/delete/{num}")
    public ResponseEntity<String> deleteBook(@PathVariable("num") int x) {
        Book book = new Book();
        book.setBookId(x);
        try {
            bookService.removeBookService(book);
            return ResponseEntity.status(HttpStatus.OK).body("Book is deleted...");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}
