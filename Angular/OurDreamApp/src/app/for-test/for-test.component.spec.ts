import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ForTestComponent } from './for-test.component';

describe('ForTestComponent', () => {
  let component: ForTestComponent;
  let fixture: ComponentFixture<ForTestComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ForTestComponent]
    });
    fixture = TestBed.createComponent(ForTestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
