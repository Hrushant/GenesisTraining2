import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TigerComponent } from './tiger.component';

describe('TigerComponent', () => {
  let component: TigerComponent;
  let fixture: ComponentFixture<TigerComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TigerComponent]
    });
    fixture = TestBed.createComponent(TigerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
