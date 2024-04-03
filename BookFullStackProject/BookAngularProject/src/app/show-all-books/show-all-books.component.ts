import { Component } from '@angular/core';
import { BookService } from '../book.service';
import { Book } from '../Book';
import { SpringBookService } from '../spring-book.service';

@Component({
  selector: 'app-show-all-books',
  templateUrl: './show-all-books.component.html',
  styleUrls: ['./show-all-books.component.css']
})
export class ShowAllBooksComponent {
  // constructor(private showAllB: BookService) {
  // }

  // allBooks!: Book[];
  // localViewAllBooks() {
  //   this.allBooks = this.showAllB.showAllBooks();
  // }

  constructor(private showAllBService: SpringBookService) { }

  allBooks!: Book[];
  localViewAllBooks() {
    this.showAllBService.showAllBooks().subscribe(
      res => {
        this.allBooks = res;
      },
      err => {
        console.log(err.error);
      }
    );
  }
}
