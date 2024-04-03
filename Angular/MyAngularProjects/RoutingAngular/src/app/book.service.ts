import { Injectable } from '@angular/core';
import { Book } from './Book';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  actualBooks: Book[]=[ // CENTRAL DATA ACROSS THIS PROJECT
    {bookId:101,bookName:"Java Programming",bookAuthor:"James Gosling",bookPrice:580},
    {bookId:102,bookName:"Unix Programming",bookAuthor:"Richard Stallman",bookPrice:780},
    {bookId:103,bookName:"Angular Programming",bookAuthor:"Balram Chavan",bookPrice:880},
    {bookId:104,bookName:"C++ Programming",bookAuthor:"Stanley Lippman",bookPrice:480},
    {bookId:105,bookName:"Oracle Programming",bookAuthor:"Bill Pribyl",bookPrice:680}, 
  ];

  constructor() { }

  getAllBooks() : Book[] { //invoked by ViewAllBooksComponent
    console.log('Returning all books...',this.actualBooks);
    return this.actualBooks; //return the original array which has all the books
  }

  addABook(newBook:Book) {
    console.log('Pushing a new Book...',newBook);
    this.actualBooks.push(newBook); // push a book even if it is duplicate
  }

  editABook(bookToEdit:Book) : boolean {
    console.log('Editing a new Book...',bookToEdit);
    for (let eachBookOfArray of this.actualBooks) { //step thru the original array
      if (eachBookOfArray.bookId == bookToEdit.bookId) { //if the original array's bookid matches with bookid to be found for editing
          this.actualBooks.splice(this.actualBooks.indexOf(eachBookOfArray), 1); //then remove that book as per first occurance of that index
          this.actualBooks.push(bookToEdit); // AND ADD THE ONE WHICH IS SENT AS EDITED BOOK
          return true;//exit the loop with true, since book is found and deleted too
      }      
    }
    return false;
  }

  findABook(bookIdToFind: number) : Book {
    console.log('Finding an existing Book Id : '+bookIdToFind);
    //this.actualBooks.filter(bookIdToFind => bookIdToFind!)
    let bookFound!: Book;
    
    for (let index = 0; index < this.actualBooks.length; index++) {
      const eachBookOfArray = this.actualBooks[index];
      if(eachBookOfArray.bookId == bookIdToFind) { //if th book in array and bookIdToFind matches then 
        bookFound =  eachBookOfArray; //assign that book to the local book
        break;
      }
    }
    return bookFound; //return that local book
  }

  deleteABook(bookIdToDelete: number) : boolean {
    console.log('Deleting a book from the array ...'+bookIdToDelete);
    for (let eachBookOfArray of this.actualBooks) { //step thru the original array
          if (eachBookOfArray.bookId == bookIdToDelete) { //if the original array's bookid matches with bookid to be found for deletion
              this.actualBooks.splice(this.actualBooks.indexOf(eachBookOfArray), 1); //then remove that book as per first occurance of that index
              return true;//exit the loop with true, since book is found and deleted too
          }      
        }
      console.log('array : '+this.actualBooks);  
    return false;     //book not found till the end of the loop
  }
}
