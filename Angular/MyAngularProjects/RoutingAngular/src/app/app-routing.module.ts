import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';

import { ViewSingleBookComponent } from './view-single-book/view-single-book.component';
import { ViewAllBooksComponent } from './view-all-books/view-all-books.component';
import { EditBookComponent } from './edit-book/edit-book.component';
import { DeleteBookComponent } from './delete-book/delete-book.component';
import { AddBookComponent } from './add-book/add-book.component';

const routes: Routes = [
    { path:'', component: AddBookComponent},
    { path:'AddBook', component: AddBookComponent},
    { path:'ViewBook', component: ViewSingleBookComponent},
    { path:'ViewAllBooks', component: ViewAllBooksComponent},
    { path:'EditBook', component: EditBookComponent},
    { path:'DeleteBook', component: DeleteBookComponent}
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }