import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { UsersService } from 'src/app/services/users.service';
import { users } from 'src/app/classes/users';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private user:UsersService) {

  }

  userprofileForm = new FormGroup({
    name : new FormControl(''),
    type: new FormControl(''),
    password : new FormControl('')
  })

  onSubmit(data1:any)
  {
    // console.log(data1);
   var newuser = new  users();
   newuser=data1;
    //console.log(newuser);
    this.user.addusers(newuser)
    .subscribe({
      next:(data)=>{
        console.log(data);
      },
      error:(err)=>{
        console.log(err);
      },
      complete:()=>{
        alert("Registered successfully");
      }
    })
  }

  ngOnInit(): void {
  }

}
