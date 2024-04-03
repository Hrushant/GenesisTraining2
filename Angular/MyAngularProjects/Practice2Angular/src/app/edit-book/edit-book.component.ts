import { Component } from '@angular/core';
import { BookService } from '../book.service';
import { Book } from '../Book';

@Component({
  selector: 'app-edit-book',
  templateUrl: './edit-book.component.html',
  styleUrls: ['./edit-book.component.css']
})
export class EditBookComponent {
  constructor(private book:BookService){

  }

  bookToEdit! : Book;
  localEditBook(){
    this.book.editABook(this.bookToEdit);
  }
}
