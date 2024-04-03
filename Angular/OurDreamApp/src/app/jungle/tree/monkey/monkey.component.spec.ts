import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MonkeyComponent } from './monkey.component';

describe('MonkeyComponent', () => {
  let component: MonkeyComponent;
  let fixture: ComponentFixture<MonkeyComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MonkeyComponent]
    });
    fixture = TestBed.createComponent(MonkeyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
