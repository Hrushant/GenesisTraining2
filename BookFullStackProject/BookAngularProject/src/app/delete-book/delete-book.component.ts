import { Component } from '@angular/core';
import { BookService } from '../book.service';
import { Book } from '../Book';
import { SpringBookService } from '../spring-book.service';

@Component({
  selector: 'app-delete-book',
  templateUrl: './delete-book.component.html',
  styleUrls: ['./delete-book.component.css']
})
export class DeleteBookComponent {
  // constructor(private bookService: BookService) { }

  // bookIdToDelete!: number;
  // foundOrNot!: boolean;

  // localDeleteBook() {
  //   this.foundOrNot = this.bookService.deleteABook(this.bookIdToDelete);
  // }

  constructor(private deleteBService: SpringBookService) { }

  bookId: number = 0;
  localDeleteBookService() {
    this.deleteBService.deleteBook(this.bookId).subscribe(
      res => {
        alert(res);
      },
      err => {
        console.log(err.error());
      }
    )
  }
}
