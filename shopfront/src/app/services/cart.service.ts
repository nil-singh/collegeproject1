import { Injectable } from '@angular/core';
import { FormControl,FormGroup } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { cart } from '../classes/cart';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  constructor(private http:HttpClient) { }

  addtocart(cart1:cart)
  {
     return this.http.post("http://localhost:8081/cart",cart1);
  }
  getall(autoid:number)
  {
    var url="http://localhost:8081/cart/specific/"+autoid;
    return this.http.get(url);
  }
}
