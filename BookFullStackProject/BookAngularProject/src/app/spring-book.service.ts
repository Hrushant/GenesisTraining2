import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Book } from './Book';

@Injectable({
  providedIn: 'root'
})
export class SpringBookService {

  baseUrl = 'http://localhost:8080/book';
  constructor(private httpClient: HttpClient) { }

  addBook(book: Book) {
    return this.httpClient.post(this.baseUrl + "/add", book, { responseType: 'text' });
  }

  updateBook(book: Book) {
    return this.httpClient.put(this.baseUrl + "/update", book, { responseType: 'text' });
  }

  deleteBook(bookId: number) {
    return this.httpClient.delete(this.baseUrl + "/delete/" + bookId, { responseType: 'text' });
  }

  showSingleBook(bookId: number) {
    return this.httpClient.get<Book>(this.baseUrl + "/" + bookId);
  }

  showAllBooks() {
    return this.httpClient.get<Book[]>(this.baseUrl + "/getall");
  }
}


