import { Component, OnInit } from '@angular/core';
import { Input } from '@angular/core';
import { Route, Router,ActivatedRoute } from '@angular/router';
import { ProductsService } from 'src/app/services/products.service';
import { products } from 'src/app/classes/product';
import { CartService } from 'src/app/services/cart.service';
import { cart } from 'src/app/classes/cart';
import { wishlist } from 'src/app/classes/wishlist';
import { WishlistserviceService } from 'src/app/services/wishlistservice.service';
@Component({
  selector: 'app-view-product',
  templateUrl: './view-product.component.html',
  styleUrls: ['./view-product.component.css']
})
export class ViewProductComponent implements OnInit {

  constructor(private route:ActivatedRoute, private productservice:ProductsService, private cartservice:CartService,private wishlistservice:WishlistserviceService) { }
  product_id!:number;
  user_id!:number;
  product: any;
 // @Input() product_id!:number;
 
  
  cartadd(id:number)
  {
    var cart1 = new cart();
    var newcart = {
      item_name:this.product.product_name,
      quantity:10,
      product_price:this.product.product_price,
      discount_amt:0,
      autoid:this.user_id,
    }
    if(this.user_id%2==0)
    {
      newcart.discount_amt=200;
    }
    cart1=newcart;
   // console.log(cart1);
     this.cartservice.addtocart(cart1)
     .subscribe({
      next:(data)=>{
        console.log(data);
      },
      error:(err)=>{
        console.log(err);
      }
     })
  }
  ngOnInit(): void {
    this.route.queryParams
    .subscribe(params =>{
       this.product_id = params['product_id'];
       this.user_id = params['user_id'];
    })
    this.productservice.viewproduct(this.product_id)
    .subscribe({
      next:(data)=>{
        this.product = data;
        console.log(this.product);
      },
      error:(err)=>{
        console.log(err);
      }
    })
  }

wishlistadd(id:number){
  
  {
    var wishlist1 = new  wishlist();
    var newwishlist = {
      item_name:this.product.product_name,
      
      product_price:this.product.product_price,
      discount_amt:0,
      autoid:this.user_id,
    }
   
    wishlist1=newwishlist;
   // console.log(cart1);
     this.wishlistservice.addtowishlist(wishlist1)
     .subscribe({
      next:(data)=>{
        console.log(wishlist1.item_name);
        alert(wishlist1.item_name +"  added to wishlist succesfully")
      },
      error:(err)=>{
        console.log(err);
      }
     })
  }
}


}
