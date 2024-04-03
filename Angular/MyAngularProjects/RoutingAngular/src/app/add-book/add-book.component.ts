import { Component, OnInit } from '@angular/core';
import { Book } from '../Book';
import { BookService } from '../book.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {

  constructor(private bookService: BookService, private router: Router)
  { }

  blankBook: Book = new Book();
  
  localAddBook() { // a local add book function invoked on button click of this form
    console.log('localAddBook ',this.blankBook);
    this.bookService.addABook(this.blankBook); //invoking service's function which actually adds the book to the array of the service
    alert('Book is added successfully...');
    this.router.navigate(['/ViewAllBooks']); //router link as per the routes Array
  }
  ngOnInit(): void {

  }

}
