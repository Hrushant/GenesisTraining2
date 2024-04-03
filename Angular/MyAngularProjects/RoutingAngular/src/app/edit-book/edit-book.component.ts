import { Component, OnInit } from '@angular/core';
import { BookService } from '../book.service';
import { Router } from '@angular/router';
import { Book } from '../Book';

@Component({
  selector: 'app-edit-book',
  templateUrl: './edit-book.component.html',
  styleUrls: ['./edit-book.component.css']
})
export class EditBookComponent implements OnInit {

  constructor(private bookService: BookService, private router: Router)
  { }

  bookToEdit: Book = new Book();
  isEdited!: boolean;

  localEditBook() { // a local add book function invoked on button click of this form
    console.log('localEditBook ',this.bookToEdit);
    this.isEdited = this.bookService.editABook(this.bookToEdit); //invoking service's function which actually adds the book to the array of the service
    if(this.isEdited==true)
      alert('Book is edited successfully...');
    else
      alert('Book with this Id doesnot exists : ' + this.bookToEdit.bookId);

    this.router.navigate(['/ViewAllBooks']); //router link as per the routes Array
  }

  ngOnInit(): void {
  }

}
