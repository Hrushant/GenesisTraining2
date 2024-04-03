import { Component } from '@angular/core';
import { FriendService } from '../friend.service';
import { Friend } from '../Friend';

@Component({
  selector: 'app-show-all-friends',
  templateUrl: './show-all-friends.component.html',
  styleUrls: ['./show-all-friends.component.css']
})
export class ShowAllFriendsComponent {
  constructor(private showAllF: FriendService) {
  }

  allFriends!: Friend[];
  localViewAllFriends() {
    this.allFriends = this.showAllF.showAllFriends();
  }
}
