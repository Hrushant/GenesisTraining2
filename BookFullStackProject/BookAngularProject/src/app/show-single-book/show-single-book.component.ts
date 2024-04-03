import { Component } from '@angular/core';
import { BookService } from '../book.service';
import { Book } from '../Book';
import { SpringBookService } from '../spring-book.service';

@Component({
  selector: 'app-show-single-book',
  templateUrl: './show-single-book.component.html',
  styleUrls: ['./show-single-book.component.css']
})
export class ShowSingleBookComponent {
  // constructor(private viewB: BookService) {
  // }

  // BookIdToSearch!: number;
  // foundBook!: Book;
  // localViewBook() {
  //   this.foundBook = this.viewB.findABook(this.BookIdToSearch);
  //   if (this.foundBook == undefined) {
  //     this.BookIdToSearch = 0;
  //   }
  // }

  constructor(private viewBService: SpringBookService) { }

  BookIdToSearch!: number;
  foundBook = new Book;

  localViewBookService() {
    this.viewBService.showSingleBook(this.BookIdToSearch).subscribe(
      res => {
        this.foundBook = res;
      },
      err => {
        console.log(err.error);
      }
    );
  }
}
