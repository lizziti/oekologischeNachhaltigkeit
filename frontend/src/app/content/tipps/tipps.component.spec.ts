import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TippsComponent } from './tipps.component';

describe('TippsComponent', () => {
  let component: TippsComponent;
  let fixture: ComponentFixture<TippsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TippsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TippsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
