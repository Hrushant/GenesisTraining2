import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SwitchTestComponent } from './switch-test.component';

describe('SwitchTestComponent', () => {
  let component: SwitchTestComponent;
  let fixture: ComponentFixture<SwitchTestComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SwitchTestComponent]
    });
    fixture = TestBed.createComponent(SwitchTestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
