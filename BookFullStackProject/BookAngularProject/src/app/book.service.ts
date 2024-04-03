import { Injectable } from '@angular/core';
import { Book } from './Book';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  actualBook: Book[] = [
    { bookId: 101, bookName: "Mrutunjay", bookPrice: 500 },
    { bookId: 102, bookName: "Mahabharat", bookPrice: 900 },
    { bookId: 103, bookName: "Atomic Habits", bookPrice: 300 },
    { bookId: 104, bookName: "Hamlet", bookPrice: 200 },
    { bookId: 105, bookName: "The Stranger", bookPrice: 1000 },
    { bookId: 106, bookName: "War and Peace", bookPrice: 3050 },
    { bookId: 107, bookName: "The Trial", bookPrice: 270 },
    { bookId: 108, bookName: "King Lear", bookPrice: 570 },
    { bookId: 109, bookName: "Beloved", bookPrice: 780 },
    { bookId: 110, bookName: "The Idiot", bookPrice: 460 }
  ];

  constructor() { }

  showAllBooks(): Book[] {
    console.log('Return all the Books...', this.actualBook);
    return this.actualBook;
  }

  addABook(newBook: Book) {
    console.log('Add new Book...', newBook);
    this.actualBook.push(newBook);
  }

  editABook(BookToEdit: Book): boolean {
    console.log('Edit a Book...', BookToEdit);
    for (let eachBookOfArray of this.actualBook) {
      if (eachBookOfArray.bookId == BookToEdit.bookId) {
        this.actualBook.splice(this.actualBook.indexOf(eachBookOfArray), 1);  //remove previous one
        this.actualBook.push(BookToEdit);  //adding new one
        return true;
      }
    }
    return false;
  }

  findABook(BookIdToFind: number): Book {
    console.log('Find existing Book Id : ' + BookIdToFind);
    let BookFound!: Book;
    for (let i = 0; i < this.actualBook.length; i++) {
      const eachBookOfArray = this.actualBook[i];
      if (eachBookOfArray.bookId == BookIdToFind) {
        BookFound = eachBookOfArray;
        break;
      }
    }
    return BookFound;
  }

  deleteABook(bookIdToDelete: number): boolean {
    console.log('Deleting a book...' + bookIdToDelete);
    for (let eachBookOfArray of this.actualBook) {
      if (eachBookOfArray.bookId == bookIdToDelete) {
        this.actualBook.splice(this.actualBook.indexOf(eachBookOfArray), 1);
        return true;
      }
    }
    console.log('array : ' + this.actualBook);
    return false;
  }
}
