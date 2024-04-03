import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowAllFriendsComponent } from './show-all-friends.component';

describe('ShowAllFriendsComponent', () => {
  let component: ShowAllFriendsComponent;
  let fixture: ComponentFixture<ShowAllFriendsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ShowAllFriendsComponent]
    });
    fixture = TestBed.createComponent(ShowAllFriendsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
