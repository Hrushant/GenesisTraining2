import { Component } from '@angular/core';

@Component({
  selector: 'app-like-dis-like',
  templateUrl: './like-dis-like.component.html',
  styleUrls: ['./like-dis-like.component.css']
})
export class LikeDisLikeComponent {
  pageStyle="pageStyle";
  button1="button1";
  button2="button2";
  likeLabel = "Like";
  likeCnt=0;
  disLikeLabel = "DisLike";
  disLikeCnt=0;
  likeCount(){
    this.likeCnt++;
    if(this.likeCnt > 10)
    {
      alert("Reached to highest limit");
      this.likeCnt=0;
    }
  }
  disLikeCount(){
    this.disLikeCnt++;
    if(this.disLikeCnt > 10){
      alert("Reached to highest limit");
      this.disLikeCnt=0;
    }
  }
}
