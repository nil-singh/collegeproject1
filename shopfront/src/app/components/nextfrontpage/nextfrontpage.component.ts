import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Router } from '@angular/router';
@Component({
  selector: 'app-nextfrontpage',
  templateUrl: './nextfrontpage.component.html',
  styleUrls: ['./nextfrontpage.component.css']
})
export class NextfrontpageComponent implements OnInit {

  constructor(private route:ActivatedRoute,private router:Router) { }



  ngOnInit(): void {
  
  }

}
