import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { WishlistserviceService } from 'src/app/services/wishlistservice.service';
import { ActivatedRoute } from '@angular/router';
@Component({
  selector: 'app-viewwishlist',
  templateUrl: './viewwishlist.component.html',
  styleUrls: ['./viewwishlist.component.css']
})
export class ViewwishlistComponent implements OnInit {

 
 constructor(private wishlistservice:WishlistserviceService,private route:ActivatedRoute) { }
user_id!:number;
wishlistproducts:any = [];
ngOnInit(): void {
  this.route.queryParams
  .subscribe(params =>{
     this.user_id = params['user_id'];
  })
 
  this.wishlistservice.getallwishlist(this.user_id)
  .subscribe({
    next:(data)=>{
      console.log(data);
      this.wishlistproducts=data;
    },
    error:(err)=>{
      console.log(err);
    }
  })
}

}
