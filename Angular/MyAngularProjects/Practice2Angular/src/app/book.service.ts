import { Injectable } from '@angular/core';
import { Book } from './Book';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  actualBooks: Book[] = [
    { bookId: 101, bookName: 'Atomic Habits', bookAuthor: 'James Clear', bookPrice: 200 },
    { bookId: 102, bookName: 'Java Programming', bookAuthor: 'James Gosling', bookPrice: 400 },
    { bookId: 103, bookName: 'Atomic Items', bookAuthor: 'Eienstaine', bookPrice: 600 }
  ];
  constructor() { }


  getAllBooks(): Book[] {
    console.log('Return all the books...', this.actualBooks);
    return this.actualBooks;
  }

  addABook(newBook: Book) {
    console.log('Push new Book...', newBook);
    this.actualBooks.push(newBook);
  }

  editABook(bookToEdit: Book): boolean {
    console.log('Edit a new Book...', bookToEdit);
    for (let eachBookOfArray of this.actualBooks) {
      if (eachBookOfArray.bookId == bookToEdit.bookId) {
        this.actualBooks.splice(this.actualBooks.indexOf(eachBookOfArray), 1);
        this.actualBooks.push(bookToEdit);
        return true;
      }
    }
    return false;
  }

  findABook(bookIdToFind: number): Book {
    console.log('Find existing Book Id : ' + bookIdToFind);
    let bookFound!: Book;
    for (let index = 0; index < this.actualBooks.length; index++) {
      const eachBookOfArray = this.actualBooks[index];
      if (eachBookOfArray.bookId == bookIdToFind) {
        bookFound = eachBookOfArray;
        break;
      }
    }
    return bookFound;
  }

  deleteABook(bookIdToDelete: number): boolean {
    console.log('Delete a book from array ...' + bookIdToDelete);
    for (let eachBookOfArray of this.actualBooks) {
      if (eachBookOfArray.bookId == bookIdToDelete) {
        this.actualBooks.splice(this.actualBooks.indexOf(eachBookOfArray), 1);
        return true;
      }
    }
    console.log('array : ' + this.actualBooks);
    return false;
  }
}
