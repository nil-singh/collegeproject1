package com.custotomer.customer.controller;



import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

import com.custotomer.customer.model.Users;
import com.custotomer.customer.service.UsersService;

 
@RestController
@CrossOrigin(origins="*")
public class UsersController {
 
    @Autowired
    private UsersService service;
     
    // RESTful API methods for Retrieval operations
    @GetMapping("/users")
    public List<Users> list() {
        return service.listAll();
    }
    
    @GetMapping("/users/name/{username}")
    public ResponseEntity<Users> get(@PathVariable String username) {
        try {
            Users user = service.getUser(username);
            return new ResponseEntity<Users>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
        }      
    }
    @GetMapping("/users/{id}")
    public ResponseEntity<Users> get(@PathVariable Integer id) {
        try {
            Users user = service.get(id);
            return new ResponseEntity<Users>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
        }      
    }
    
    @GetMapping("/users/{name}/{password}")
    public ResponseEntity<Users> loginuser(@PathVariable("name") String name, @PathVariable("password") String password)
    {
	   try {
		   Users user = service.loginuser(name,password);
		   return new ResponseEntity<Users>(user,HttpStatus.OK);
	     }
	   catch(Exception e)
	   {
		   return new ResponseEntity<Users>(HttpStatus.OK);
	   }
    }
    // RESTful API method for Create operation
    @PostMapping("/users")
    public void add(@RequestBody Users users) {
        service.save(users);
    }
     
    @PutMapping("/userupdate")
	public void update(@RequestBody Users users) {
		 service.update(users);
	}
    
    // RESTful API method for Delete operation
    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
    
   
}