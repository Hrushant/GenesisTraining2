import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { LoginRegistrationComponent } from './login-registration/login-registration.component';
import { FormsModule } from '@angular/forms';
import { LikeDisLikeComponent } from './like-dis-like/like-dis-like.component';
import { CompoundInterestComponent } from './compound-interest/compound-interest.component';
import { CompoundInterestPipe } from './compound-interest.pipe';
import { FundTransferComponent } from './fund-transfer/fund-transfer.component';
import { AddFriendComponent } from './add-friend/add-friend.component';
import { ViewFriendComponent } from './view-friend/view-friend.component';
import { ShowAllFriendsComponent } from './show-all-friends/show-all-friends.component';
import { ModifyFriendComponent } from './modify-friend/modify-friend.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegistrationComponent,
    LoginRegistrationComponent,
    LikeDisLikeComponent,
    CompoundInterestComponent,
    CompoundInterestPipe,
    FundTransferComponent,
    AddFriendComponent,
    ViewFriendComponent,
    ShowAllFriendsComponent,
    ModifyFriendComponent
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
