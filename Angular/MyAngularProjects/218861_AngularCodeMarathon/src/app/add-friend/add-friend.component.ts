import { Component } from '@angular/core';
import { FriendService } from '../friend.service';
import { Friend } from '../Friend';

@Component({
  selector: 'app-add-friend',
  templateUrl: './add-friend.component.html',
  styleUrls: ['./add-friend.component.css']
})
export class AddFriendComponent {
  constructor(private addF: FriendService) {
  }

  blankFriend: Friend = new Friend;
  localAddFriend() {
    this.addF.addAFriend(this.blankFriend);
  }

}
