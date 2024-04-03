import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LikeDislikeComponent } from './like-dislike/like-dislike.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { CompoundInterestComponent } from './compound-interest/compound-interest.component';
import { CompoundInterestPipe } from './compound-interest.pipe';
import { FormsModule } from '@angular/forms';
import { FundTransferComponent } from './fund-transfer/fund-transfer.component';


@NgModule({
  declarations: [
    AppComponent,
    LikeDislikeComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    CompoundInterestComponent,
    CompoundInterestPipe,
    FundTransferComponent
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
