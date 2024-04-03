import { Component, OnInit } from '@angular/core';
import { Book } from '../Book';
import { BookService } from '../book.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-delete-book',
  templateUrl: './delete-book.component.html',
  styleUrls: ['./delete-book.component.css']
})
export class DeleteBookComponent implements OnInit {

  constructor(private bookService: BookService, private router: Router)
  {}
  
  bookIdToDelete!: number;
  foundOrNot!: boolean;

  localDeleteBook() {
    this.foundOrNot=this.bookService.deleteABook(this.bookIdToDelete);
    if(this.foundOrNot==false) {
      alert('Book with this Id doesnot exists : ' + this.bookIdToDelete);
    }
    else {
      alert('Book with this Id deleted : ' + this.bookIdToDelete);
      this.router.navigate(['/ViewAllBooks']);
    }
  }
  ngOnInit(): void {
  }

}
