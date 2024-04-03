import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModifyStatementComponent } from './modify-statement.component';

describe('ModifyStatementComponent', () => {
  let component: ModifyStatementComponent;
  let fixture: ComponentFixture<ModifyStatementComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ModifyStatementComponent]
    });
    fixture = TestBed.createComponent(ModifyStatementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
