import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FleischalternativenComponent } from './fleischalternativen.component';

describe('FleischalternativenComponent', () => {
  let component: FleischalternativenComponent;
  let fixture: ComponentFixture<FleischalternativenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FleischalternativenComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FleischalternativenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
