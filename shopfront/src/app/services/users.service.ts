import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { users } from '../classes/users';
@Injectable({
  providedIn: 'root'
})
export class UsersService {

  constructor(private http:HttpClient) { }

  addusers(newuser : users)
  {
     return this.http.post("http://localhost:8081/users",newuser);
  } 
  loginuser(name:string, password:string)
  {
      var url = "http://localhost:8081/users/"+name+"/"+password;
      return this.http.get(url);
  }
  getuser(name:string)
  {
    var url="http://localhost:8081/users/name/"+name;
    return this.http.get(url);
  }
  alluser()
  {
    return this.http.get("http://localhost:8081/users");
  }
  updateuser(newuser:users)
  {
    var url = "http://localhost:8081/userupdate/";
    return this.http.put(url,newuser);
  }
  deleteuser(id:number)
  {
    var url = "http://localhost:8081/users/"+id;
    return this.http.delete(url);
  }
}
