import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LebensmittelComponent } from './lebensmittel.component';

describe('LebensmittelComponent', () => {
  let component: LebensmittelComponent;
  let fixture: ComponentFixture<LebensmittelComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LebensmittelComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LebensmittelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
