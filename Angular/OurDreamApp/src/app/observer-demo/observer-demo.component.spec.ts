import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ObserverDemoComponent } from './observer-demo.component';

describe('ObserverDemoComponent', () => {
  let component: ObserverDemoComponent;
  let fixture: ComponentFixture<ObserverDemoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ObserverDemoComponent]
    });
    fixture = TestBed.createComponent(ObserverDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
