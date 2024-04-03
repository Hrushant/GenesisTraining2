import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ViewSingleBookComponent } from './view-single-book/view-single-book.component';
import { ViewAllBooksComponent } from './view-all-books/view-all-books.component';
import { EditBookComponent } from './edit-book/edit-book.component';
import { DeleteBookComponent } from './delete-book/delete-book.component';
import { AddBookComponent } from './add-book/add-book.component';
import { AppRoutingModule } from './app-routing.module';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    ViewSingleBookComponent,
    ViewAllBooksComponent,
    EditBookComponent,
    DeleteBookComponent,
    AddBookComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
