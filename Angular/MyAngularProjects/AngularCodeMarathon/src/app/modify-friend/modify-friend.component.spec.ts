import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModifyFriendComponent } from './modify-friend.component';

describe('ModifyFriendComponent', () => {
  let component: ModifyFriendComponent;
  let fixture: ComponentFixture<ModifyFriendComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ModifyFriendComponent]
    });
    fixture = TestBed.createComponent(ModifyFriendComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
