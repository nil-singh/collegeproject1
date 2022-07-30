import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ActivatedRoute } from '@angular/router';
@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  
  constructor(private route:ActivatedRoute,private router:Router) { }
  //  @Input() userid1!:number;
  uname!:string;
  role!:string;
   uid()
   {
    alert("hi");
   }
   home()
   {
     this.router.navigate(['home'],{})
   }
   products()
   {
     this.router.navigate(['home'],{})
   }
  ngOnInit(): void {
    this.route.queryParams
    .subscribe(params =>{
       this.uname = params['name'];
       this.role = params['role']; 
    })
  }

}
