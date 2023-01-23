import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FrauasNachhaltigkeitComponent } from './frauas-nachhaltigkeit.component';

describe('FrauasNachhaltigkeitComponent', () => {
  let component: FrauasNachhaltigkeitComponent;
  let fixture: ComponentFixture<FrauasNachhaltigkeitComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FrauasNachhaltigkeitComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FrauasNachhaltigkeitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
