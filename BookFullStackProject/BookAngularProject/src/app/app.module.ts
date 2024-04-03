import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddBookComponent } from './add-book/add-book.component';
import { ModifyBookComponent } from './modify-book/modify-book.component';
import { DeleteBookComponent } from './delete-book/delete-book.component';
import { ShowSingleBookComponent } from './show-single-book/show-single-book.component';
import { ShowAllBooksComponent } from './show-all-books/show-all-books.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http'

@NgModule({
  declarations: [
    AppComponent,
    AddBookComponent,
    ModifyBookComponent,
    DeleteBookComponent,
    ShowSingleBookComponent,
    ShowAllBooksComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
