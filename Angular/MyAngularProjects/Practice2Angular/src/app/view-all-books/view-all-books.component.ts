import { Component } from '@angular/core';
import { BookService } from '../book.service';
import { Book } from '../Book';

@Component({
  selector: 'app-view-all-books',
  templateUrl: './view-all-books.component.html',
  styleUrls: ['./view-all-books.component.css']
})
export class ViewAllBooksComponent {
  
  constructor(private showAllBook:BookService){
    
  }

  allBooks!:Book[];
  localViewAllBooks(){
    this.allBooks= this.showAllBook.getAllBooks();
  }
}
