import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddBookComponent } from './add-book/add-book.component';
import { ModifyBookComponent } from './modify-book/modify-book.component';
import { DeleteBookComponent } from './delete-book/delete-book.component';
import { ShowSingleBookComponent } from './show-single-book/show-single-book.component';
import { ShowAllBooksComponent } from './show-all-books/show-all-books.component';

const routes: Routes = [
  {path:"",component:AddBookComponent},
  {path:"addBook",component:AddBookComponent},
  {path:"modifyBook",component:ModifyBookComponent},
  {path:"deleteBook",component:DeleteBookComponent},
  {path:"showSingleBook",component:ShowSingleBookComponent},
  {path:"showAllBooks",component:ShowAllBooksComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
