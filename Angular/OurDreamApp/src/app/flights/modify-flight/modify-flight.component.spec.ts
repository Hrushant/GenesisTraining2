import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModifyFlightComponent } from './modify-flight.component';

describe('ModifyFlightComponent', () => {
  let component: ModifyFlightComponent;
  let fixture: ComponentFixture<ModifyFlightComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ModifyFlightComponent]
    });
    fixture = TestBed.createComponent(ModifyFlightComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});