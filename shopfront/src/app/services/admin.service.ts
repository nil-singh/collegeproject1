import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private http : HttpClient) { }
  loginuser(name:string, password:string)
  {
      var url = "http://localhost:8081/admin/"+name+"/"+password;
      return this.http.get(url);
  }
}
