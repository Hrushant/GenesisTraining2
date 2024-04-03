import { Injectable } from '@angular/core';
import { Friend } from './Friend';

@Injectable({
  providedIn: 'root'
})
export class FriendService {

  actualFriend: Friend[] = [
    { name: 'Abhijit', gender: 'male', age: 22, yearsOfFriendship: 2 },
    { name: 'Sohan', gender: 'male', age: 21, yearsOfFriendship: 1 },
    { name: 'Mayuri', gender: 'female', age: 20, yearsOfFriendship: 4 }
  ];

  constructor() { }

  showAllFriends(): Friend[] {
    console.log('Return all the Friends...', this.actualFriend);
    return this.actualFriend;
  }

  addAFriend(newFriend: Friend) {
    console.log('Add new Friend...', newFriend);
    this.actualFriend.push(newFriend);
  }

  editAFriend(friendToEdit: Friend): boolean {
    console.log('Edit a Friend...', friendToEdit);
    for (let eachFriendOfArray of this.actualFriend) {
      if (eachFriendOfArray.name == friendToEdit.name) {
        this.actualFriend.splice(this.actualFriend.indexOf(eachFriendOfArray), 1);  //remove previous one
        this.actualFriend.push(friendToEdit);  //adding new one
        return true;
      }
    }
    return false;
  }

  findAFriend(friendNameToFind: string): Friend {
    console.log('Find existing Friend name : ' + friendNameToFind);
    let friendFound!: Friend;
    for (let i = 0; i < this.actualFriend.length; i++) {
      const eachFriendOfArray = this.actualFriend[i];
      if (eachFriendOfArray.name == friendNameToFind) {
        friendFound = eachFriendOfArray;
        break;
      }
    }
    return friendFound;
  }

}
