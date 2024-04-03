import { Component } from '@angular/core';
import { FriendService } from '../friend.service';
import { Friend } from '../Friend';

@Component({
  selector: 'app-view-friend',
  templateUrl: './view-friend.component.html',
  styleUrls: ['./view-friend.component.css']
})
export class ViewFriendComponent {
  constructor(private viewF: FriendService) {
  }

  friendNameToSearch: string = "";
  foundFriend!: Friend;
  localViewFriend() {
    this.foundFriend = this.viewF.findAFriend(this.friendNameToSearch);
    if (this.foundFriend == undefined) {
      this.friendNameToSearch = "";
    }
  }
}
