import { Component, OnInit } from '@angular/core';
import { BookService } from '../book.service';
import { Book } from '../Book';

@Component({
  selector: 'app-view-all-books',
  templateUrl: './view-all-books.component.html',
  styleUrls: ['./view-all-books.component.css']
})
export class ViewAllBooksComponent implements OnInit {

  constructor(private bookService: BookService) { }

  //below variable is printed by the HTML of this page
  allBooks!: Book[]; //an empty list, filled with BookService's getAllBooks() on ngOnInit() below

  ngOnInit(): void {
    this.allBooks = this.bookService.getAllBooks();
  }

}
