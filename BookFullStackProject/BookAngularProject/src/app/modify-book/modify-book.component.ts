import { Component } from '@angular/core';
import { Book } from '../Book';
import { BookService } from '../book.service';
import { SpringBookService } from '../spring-book.service';

@Component({
  selector: 'app-modify-book',
  templateUrl: './modify-book.component.html',
  styleUrls: ['./modify-book.component.css']
})
export class ModifyBookComponent {
  // constructor(private modifyB: BookService) {
  // }

  // BookToEdit: Book = new Book();
  // isEdited!: boolean;
  // localEditBook() {
  //   this.isEdited = this.modifyB.editABook(this.BookToEdit);
  // }

  constructor(private modifyBService: SpringBookService) { }

  book = new Book();
  localEditBookService() {
    this.modifyBService.updateBook(this.book).subscribe(
      res => {
        alert(res);
      },
      err => {
        console.log(err.error);
      }
    )
  }
}
