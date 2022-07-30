import { Component, OnInit } from '@angular/core';
import { ProductsService } from 'src/app/services/products.service';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  allproducts:any=[];
  constructor(private productsservice:ProductsService) { }

  ngOnInit(): void {
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
  }

}
