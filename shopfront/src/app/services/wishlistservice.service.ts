import { Injectable } from '@angular/core';
import { FormControl,FormGroup } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { wishlist } from '../classes/wishlist';
@Injectable({
  providedIn: 'root'
})
export class WishlistserviceService {

  constructor(private http:HttpClient) { }
  addtowishlist(wishlist1:wishlist){
    return this.http.post("http://localhost:8081/wishlist/add",wishlist1);
  }
  getallwishlist(autoid:number)
{
  var url="http://localhost:8081/wishlist/specific/"+autoid;
  return this.http.get(url);
}
}








  

