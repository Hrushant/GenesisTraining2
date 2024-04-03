import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LikeDisLikeComponent } from './like-dis-like/like-dis-like.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { CompoundInterestComponent } from './compound-interest/compound-interest.component';
import { CompoundInterestPipe } from './compound-interest.pipe';
import { FormsModule } from '@angular/forms';
import { FundTransferComponent } from './fund-transfer/fund-transfer.component';
import { ViewAllBooksComponent } from './view-all-books/view-all-books.component';
import { ViewSingleBookComponent } from './view-single-book/view-single-book.component';
import { AddBookComponent } from './add-book/add-book.component';
import { EditBookComponent } from './edit-book/edit-book.component';
import { DeleteBookComponent } from './delete-book/delete-book.component';

@NgModule({
  declarations: [
    AppComponent,
    LikeDisLikeComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    CompoundInterestComponent,
    CompoundInterestPipe,
    FundTransferComponent,
    ViewAllBooksComponent,
    ViewSingleBookComponent,
    AddBookComponent,
    EditBookComponent,
    DeleteBookComponent
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
