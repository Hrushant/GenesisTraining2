import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LionComponent } from './lion.component';

describe('LionComponent', () => {
  let component: LionComponent;
  let fixture: ComponentFixture<LionComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LionComponent]
    });
    fixture = TestBed.createComponent(LionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
