import { Injectable } from '@angular/core';
import { FormControl,FormGroup } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { products } from '../classes/product';
@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  constructor(private http:HttpClient) { }
  getproduct(){
    return this.http.get("http://localhost:8081/products");
  }
  addproduct(products:products){
    return this.http.post("http://localhost:8081/products",products);
  }
  viewproduct(pid:number)
  {
    var url="http://localhost:8081/products/"+pid;
    return this.http.get(url);
  }
  deleteproduct(id:number)
  {
    var url="http://localhost:8081/products/"+id;
    return this.http.delete(url);
  }
}
