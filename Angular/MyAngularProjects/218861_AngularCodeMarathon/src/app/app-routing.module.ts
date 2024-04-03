import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddFriendComponent } from './add-friend/add-friend.component';
import { ViewFriendComponent } from './view-friend/view-friend.component';
import { ShowAllFriendsComponent } from './show-all-friends/show-all-friends.component';
import { ModifyFriendComponent } from './modify-friend/modify-friend.component';

const routes: Routes = [
  { path: "", component: AddFriendComponent },
  { path: "addFriend", component: AddFriendComponent },
  { path: 'viewFriend', component: ViewFriendComponent },
  { path: "showAllFriends", component: ShowAllFriendsComponent },
  { path: "modifyFriend", component: ModifyFriendComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
