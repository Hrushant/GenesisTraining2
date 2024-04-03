import { Component } from '@angular/core';

@Component({
  selector: 'app-like-dis-like',
  templateUrl: './like-dis-like.component.html',
  styleUrls: ['./like-dis-like.component.css']
})
export class LikeDisLikeComponent {
  likeLabel = "Like";
  likeCnt = 0;
  disLikeLabel = "DisLike";
  disLikeCnt = 0;

  container="container";
  buttonStyle1 = "buttonStyle1";
  buttonStyle2 = "buttonStyle2";

  likeCount(){
    this.likeCnt++;
    if(this.likeCnt == 101){
      this.likeCnt=1;
      alert("Reached to highest limit");
    }
  }

  disLikeCount(){
    this.disLikeCnt++;
    if(this.disLikeCnt == 21){
      this.disLikeCnt=1;
      alert("Reached to highest limit");
    }
  }
}
