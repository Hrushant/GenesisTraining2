import { Component } from '@angular/core';
import { BookService } from '../book.service';
import { Book } from '../Book';

@Component({
  selector: 'app-view-single-book',
  templateUrl: './view-single-book.component.html',
  styleUrls: ['./view-single-book.component.css']
})
export class ViewSingleBookComponent {
  constructor(private viewBook : BookService){

  }
  bookIdToSerch:number=0;
  foundBook!:Book;
  localViewSingleBook(){
    this.foundBook=this.viewBook.findABook(this.bookIdToSerch);
  }
}
