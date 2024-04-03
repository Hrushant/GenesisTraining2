import { Component } from '@angular/core';
import { BookService } from '../book.service';
import { Router } from '@angular/router';
import { Book } from '../Book';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent {
  blankBook:Book=new Book;
  constructor(private addBook:BookService){

  }

  localAddBook(){
    this.addBook.addABook(this.blankBook);
  }
}
