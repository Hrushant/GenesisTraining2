import { Component } from '@angular/core';
import { BookService } from '../book.service';
import { Book } from '../Book';
import { SpringBookService } from '../spring-book.service';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent {
  // constructor(private addB: BookService) {
  // }

  // blankBook: Book = new Book;
  // localAddBook() {
  //   this.addB.addABook(this.blankBook);
  // }

  constructor(private bookService: SpringBookService) {

  }

  book = new Book();
  localAddBookService() {
    this.bookService.addBook(this.book).subscribe(
      res => {
        alert(res);
      },
      err => { 
        console.log(err.error) 
      }
    );
  }
}
