package com.custotomer.customer.controller;



import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

import com.custotomer.customer.model.Admin;
import com.custotomer.customer.service.AdminService;

 
@RestController
public class AdminController {
 
    @Autowired
    private AdminService service;
     
    // RESTful API methods for Retrieval operations
    @GetMapping("/admin")
    public List<Admin> list() {
        return service.listAll();
    }
    @GetMapping("/admin/{id}")
    public ResponseEntity<Admin> get(@PathVariable Integer id) {
        try {
        	Admin admin = service.get(id);
            return new ResponseEntity<Admin>(admin, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
        }      
    }
    @GetMapping("/admin/{name}/{password}")
    public ResponseEntity<Admin> getadmin(@PathVariable String name, @PathVariable String password)
    {
      try {
    	  Admin admin = service.getadmin(name, password);
    	  return new ResponseEntity<Admin>(admin,HttpStatus.OK);
      }
      catch(Exception e)
      {
    	  e.getMessage();
    	  return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
      }
    }
    // RESTful API method for Create operation
    @PostMapping("/admin")
    public void add(@RequestBody Admin admin) {
        service.save(admin);
    }
     
    @PutMapping("/admin/{id}")
	public void update(@RequestBody Admin admin) {
		 service.update(admin);
	}
    
    // RESTful API method for Delete operation
    @DeleteMapping("/admin/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
    
   
}