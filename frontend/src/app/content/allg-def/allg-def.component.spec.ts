import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllgDefComponent } from './allg-def.component';

describe('AllgDefComponent', () => {
  let component: AllgDefComponent;
  let fixture: ComponentFixture<AllgDefComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AllgDefComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AllgDefComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
