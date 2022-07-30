import { Component, OnInit } from '@angular/core';
import { FormGroup ,FormControl} from '@angular/forms';
import { Router } from '@angular/router';
import { users } from 'src/app/classes/users';
import { AdminService } from 'src/app/services/admin.service';
import { UsersService } from 'src/app/services/users.service';

@Component({
  selector: 'app-frontpage',
  templateUrl: './frontpage.component.html',
  styleUrls: ['./frontpage.component.css']
})
export class FrontpageComponent implements OnInit {

  constructor(private route:Router, private user : UsersService, private admin:AdminService) { }
  name1!:string;
  loginprofileForm = new FormGroup({
    name : new FormControl(''),
    password : new FormControl(''),
    role:new FormControl('')
  }) 
  onSubmit(data1:any)
  {
     var name = data1.name;
     this.name1=name;
     var password = data1.password;
     var role = data1.role;
     if(role=="user")
     {
     this.user.loginuser(name,password)
     .subscribe({
      next:(data)=>{
         console.log(data);
         if(data==null)
         {
          alert("login failed");
         }
         else{
          alert("login success");
          //this.route.navigate(['products'],{queryParams:{name:name,role:role}});
          this.route.navigate(['nextfrontpage'],{queryParams:{name:name,role:role}})
         }
      },
      error:(err)=>{
        console.log(err);
      },
      
     })
    }
    else if(role=="admin")
    {
      this.admin.loginuser(name,password)
      .subscribe({
       next:(data)=>{
          console.log(data);
          if(data==null)
          {
           alert("login failed");
          }
          else{
           alert("login success");
          // this.route.navigate(['products'],{queryParams:{name:name,role:role}});
          this.route.navigate(['nextfrontpage'],{})
          }
       },
       error:(err)=>{
         console.log(err);
       },
       
      })
     }

  }
  ngOnInit(): void {
  }

}
