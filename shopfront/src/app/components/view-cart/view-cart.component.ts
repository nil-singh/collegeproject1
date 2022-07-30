import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CartService } from 'src/app/services/cart.service';
import { ActivatedRoute } from '@angular/router';
@Component({
  selector: 'app-view-cart',
  templateUrl: './view-cart.component.html',
  styleUrls: ['./view-cart.component.css']
})
export class ViewCartComponent implements OnInit {

  constructor(private cartservice:CartService,private route:ActivatedRoute) { }
  user_id!:number;
  cartproducts:any = [];
  ngOnInit(): void {
    this.route.queryParams
    .subscribe(params =>{
       this.user_id = params['user_id'];
    })
   
    this.cartservice.getall(this.user_id)
    .subscribe({
      next:(data)=>{
        console.log(data);
        this.cartproducts=data;
      },
      error:(err)=>{
        console.log(err);
      }
    })
  }

}
