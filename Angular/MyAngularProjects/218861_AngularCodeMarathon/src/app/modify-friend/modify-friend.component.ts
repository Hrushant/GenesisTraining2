import { Component } from '@angular/core';
import { FriendService } from '../friend.service';
import { Friend } from '../Friend';

@Component({
  selector: 'app-modify-friend',
  templateUrl: './modify-friend.component.html',
  styleUrls: ['./modify-friend.component.css']
})
export class ModifyFriendComponent {
  constructor(private modifyF: FriendService) {
  }

  friendToEdit: Friend = new Friend();
  isEdited!: boolean;
  localEditFriend() {
    this.isEdited = this.modifyF.editAFriend(this.friendToEdit);
  }
}
