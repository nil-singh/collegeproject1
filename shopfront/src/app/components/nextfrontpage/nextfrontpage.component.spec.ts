import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NextfrontpageComponent } from './nextfrontpage.component';

describe('NextfrontpageComponent', () => {
  let component: NextfrontpageComponent;
  let fixture: ComponentFixture<NextfrontpageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NextfrontpageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NextfrontpageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
