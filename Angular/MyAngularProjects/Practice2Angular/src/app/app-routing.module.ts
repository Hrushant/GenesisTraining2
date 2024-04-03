import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddBookComponent } from './add-book/add-book.component';
import { ViewAllBooksComponent } from './view-all-books/view-all-books.component';
import { ViewSingleBookComponent } from './view-single-book/view-single-book.component';
import { EditBookComponent } from './edit-book/edit-book.component';
import { DeleteBookComponent } from './delete-book/delete-book.component';

const routes: Routes = [
  {path:"",component:AddBookComponent},
  {path:'AddBook',component:AddBookComponent},
  {path:"ViewAllBooks",component:ViewAllBooksComponent},
  {path:"ViewSingleBook",component:ViewSingleBookComponent},
  {path:"EditBook",component:EditBookComponent},
  {path:"DeleteBook",component:DeleteBookComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
