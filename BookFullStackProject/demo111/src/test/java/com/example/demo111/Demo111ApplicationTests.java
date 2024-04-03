package com.example.demo111;

import java.util.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo111.MyExceptions.BookNotFoundException;
import com.example.demo111.layer2.Book;
import com.example.demo111.layer3.BookRepository;
import com.example.demo111.layer4.BookService;

@SpringBootTest
class Demo111ApplicationTests {

	@Autowired
	BookRepository bookRepository;

	@Test
	public void insertBookTest() {
		Book book = new Book();
		book.setBookId(102);
		book.setBookName("OppenHeimer");
		book.setBookPrice(500);
		bookRepository.save(book);
	}

	@Test
	public void updateBookTest() {
		Optional<Book> book = bookRepository.findById(101);
		if (book.isPresent()) {
			Book book2 = book.get();
			book2.setBookName("Marvel");
			book2.setBookPrice(1000);
			bookRepository.save(book2);
			System.out.println("Book is updated...");
		} else {
			throw new BookNotFoundException("Book not found...");
		}
	}

	@Test
	public void deleteBookTest() {
		Optional<Book> book = bookRepository.findById(102);
		if (book.isPresent()) {
			Book book2 = book.get();
			bookRepository.delete(book2);
			System.out.println("Book is deleted...");
		} else {
			throw new BookNotFoundException("Book not found...");
		}
	}

	@Test
	public void showBookTest() {
		Optional<Book> book = bookRepository.findById(101);
		if (book.isPresent()) {
			Book book2 = book.get();
			book2.getBookId();
			book2.getBookName();
			book2.getBookPrice();
			System.out.println("Book Id Found...");
		} else {
			throw new BookNotFoundException("Book Not found...");
		}

	}

	@Test
	public void showAllBookTest() {
		List<Book> bList = (List<Book>) bookRepository.findAll();
		for (Book book : bList) {
			System.out.println("Book Id : " + book.getBookId());
			System.out.println("Book Name : " + book.getBookName());
			System.out.println("Book Price : " + book.getBookPrice());
		}
	}

	// ----------------------Services-----------------------------------------------
	@Autowired
	BookService bookService;

	@Test
	public void serviceTestingForAddingBook() {
		Book book = new Book();
		book.setBookId(101);
		book.setBookName("Intersteller");
		book.setBookPrice(900);
		bookService.addBookService(book);
	}

	@Test
	public void serviceTestingForRemovingBook() {
		Book book = new Book();
		book.setBookId(101);
		bookService.removeBookService(book);
	}

	@Test
	public void serviceTestingForModifyingBook() {
		Book book = new Book();
		book.setBookId(103);
		book.setBookName("Mrutunjay");
		book.setBookPrice(9000);
		bookService.modifyBookService(book);
	}

	@Test
	public void serviceTestingForFindingBook() {
		Book book = bookService.findBookService(103);
		System.out.println("Book Id : " + book.getBookId());
		System.out.println("Book Id : " + book.getBookName());
		System.out.println("Book Id : " + book.getBookPrice());
	}

	@Test
	public void serviceTestingForFindingAllBook() {
		List<Book> bList = bookService.findAllBooksService();
		for (Book book : bList) {
			System.out.println("Book Id : " + book.getBookId());
			System.out.println("Book Id : " + book.getBookName());
			System.out.println("Book Id : " + book.getBookPrice());
		}
	}
}
