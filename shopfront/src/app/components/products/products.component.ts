import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ProductsService } from 'src/app/services/products.service';
import { FormControl, FormGroup } from '@angular/forms';
import { products } from 'src/app/classes/product';
import { Router } from '@angular/router';
import { ActivatedRoute } from '@angular/router';
import { UsersService } from 'src/app/services/users.service';
import { users } from 'src/app/classes/users';
import readXlsxFile from 'read-excel-file';


@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css'],
})
export class ProductsComponent implements OnInit {
  allproducts: any = [];
  user1:any;
  productid!:number;
  productname!:string;
  producttype!:string;
  update:number=0;
  constructor(private route:ActivatedRoute, private router:Router,private productsservice:ProductsService, private userservice:UsersService) {}
 uname!:string;
 role!:string;
 varl:number=0;
 add:number=0;
 userslist:any=[];
 userid!:number;
//  @ViewChild("userid") userid1: ElementRef;
 userprofileForm = new FormGroup({
  name : new FormControl(''),
  type: new FormControl(''),
  password : new FormControl('')
})
  productprofileForm = new FormGroup({
    product_name : new FormControl(''),
    product_type: new FormControl(''),
    product_price : new FormControl(''),
    product_desc: new FormControl('')
  })
  filer()
  {
//     const input=document.getElementById('input');
//     input?.addEventListener('change',()=>{
//   readXlsxFile(input.files[0]).then((rows)=>{
    
//   })
// })
  } 
  onSubmit(data1:any)
  {
     var prd = new products();
     prd = data1;
     console.log(prd);
     this.productsservice.addproduct(prd)
     .subscribe({
      next:(data)=>{
        console.log(data);
      },
      error:(err)=>{
         console.log(err);
      }

     })
  }
  onSubmit1(data1:any)
  {
    var newuser = new  users();
   newuser=data1;
   newuser.id = this.userid;
   if(this.update==0)
        this.update=1;
      else
         this.update=0;
    console.log(newuser);
    this.userservice.updateuser(newuser)
    .subscribe({
      next:(data)=>{
        console.log(data);
      },
      error:(err)=>{
        console.log(err);
      },
      complete:()=>{
        alert("updated successfully");
      }
    })
  }
  viewcart(id:number)
  {
    this.router.navigate(['viewcart'],{queryParams:{user_id:id}});
  }
  viewwishlist(id:number)
  {
    this.router.navigate(['viewwishlist'],{queryParams:{user_id:id}});
  }
  buyinview(pr:number,id:number)
  {
     this.router.navigate(['/viewproduct'],{queryParams:{product_id:pr,user_id:id}});
  }
  usernamecheck()
  {
    alert(this.uname);
  }
  
  userlist()
  {
     if(this.varl==0)
        this.varl=1;
      else
         this.varl=0;

      this.userservice.alluser()
      .subscribe({
        next:(data)=>{
          this.userslist=data;
          //console.log(this.userslist);
        },
        error:(err)=>{
           console.log(err);
        }
      })
  }
  updateuser(id:number)
  {
     if(this.update==0)
        this.update=1;
     else
        this.update=0;
    this.userid=id;
  }
  deleteuser(id:number)
  {
     this.userservice.deleteuser(id)
     .subscribe({
      next:(data)=>{
        console.log(data);
      },
      error:(err)=>{
        console.log(err);
      }
     })
  }
  deleteproduct(pid:number)
  {
     this.productsservice.deleteproduct(pid)
     .subscribe({
      next:(data)=>{
        console.log(data);
      },
      error:(err)=>{
        console.log(err);
      }
     }) 
  }
  addproduct1()
  {
     if(this.add==0)
      this.add=1;
    else
      this.add=0;
  }
  ngOnInit(): void {
    this.route.queryParams
    .subscribe(params =>{
       this.uname = params['name'];
       this.role = params['role']; 
    })

     this.productsservice.getproduct()
     .subscribe({
      next:(data)=>{
        console.log(data);
        this.allproducts=data;
      },
      error:(err)=>{
        console.log(err);
      }
     })
     this.userservice.getuser(this.uname)
     .subscribe({
      next:(data)=>{
        this.user1=data;
        console.log(this.user1);
      },
      error:(err)=>{
        console.log(err);
      }  
     })
  }
}
