import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PlastikComponent } from './plastik.component';

describe('PlastikComponent', () => {
  let component: PlastikComponent;
  let fixture: ComponentFixture<PlastikComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PlastikComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PlastikComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
