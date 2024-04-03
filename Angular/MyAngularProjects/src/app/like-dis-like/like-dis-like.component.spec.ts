import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LikeDisLikeComponent } from './like-dis-like.component';

describe('LikeDisLikeComponent', () => {
  let component: LikeDisLikeComponent;
  let fixture: ComponentFixture<LikeDisLikeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LikeDisLikeComponent]
    });
    fixture = TestBed.createComponent(LikeDisLikeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
