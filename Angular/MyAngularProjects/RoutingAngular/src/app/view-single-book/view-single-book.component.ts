import { Component, OnInit } from '@angular/core';
import { Book } from '../Book';
import { BookService } from '../book.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-single-book',
  templateUrl: './view-single-book.component.html',
  styleUrls: ['./view-single-book.component.css']
})
export class ViewSingleBookComponent implements OnInit {

  constructor(private bookService: BookService, private router: Router)
  {}
  
  bookIdToSearch: number=0;
  foundBook!: Book;

  localViewBook() {
    this.foundBook = this.bookService.findABook(this.bookIdToSearch);
    if(this.foundBook==undefined) {
      alert('Book with this Id doesnot exists : ' + this.bookIdToSearch);
      this.bookIdToSearch=0;
    }
  }

  ngOnInit(): void {
  }

}
