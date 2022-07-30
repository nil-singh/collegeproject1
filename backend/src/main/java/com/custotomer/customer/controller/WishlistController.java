package com.custotomer.customer.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

import com.custotomer.customer.model.Cart;
import com.custotomer.customer.model.Wishlist;
import com.custotomer.customer.service.WishListService;

 
@RestController
@CrossOrigin("*")
public class WishlistController {
 
    @Autowired
    private WishListService service;
     
    // RESTful API methods for Retrieval operations
//    @GetMapping("/wishlist")
//    public List<Wishlist> list() {
//        return service.list();
//    }
    @GetMapping("/wishlist/{id}")
    public ResponseEntity<Wishlist> get(@PathVariable Integer id) {
        try {
        	Wishlist wishlist = service.get(id);
            return new ResponseEntity<Wishlist>(wishlist, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Wishlist>(HttpStatus.NOT_FOUND);
        }      
    }
    @GetMapping("/wishlist/specific/{id}")
    public ResponseEntity<List<Wishlist>> getwishlist(@PathVariable Integer id)
    {
    	try {
    		List<Wishlist> wishlist = service.listallbyid(id);
    		return new ResponseEntity<List<Wishlist>>(wishlist,HttpStatus.OK);
    	}
    	catch(Exception e)
    	{
    		e.getMessage();
    		return new ResponseEntity<List<Wishlist>>(HttpStatus.NOT_FOUND);
    	}
    }
    // RESTful API method for Create operation
    @PostMapping("/wishlist/add")
    public void add(@RequestBody Wishlist wishlist) {
        service.save(wishlist);
    }
     
    @PutMapping("/wishlist/{id}")
	public void update(@RequestBody Wishlist wishlist) {
		 service.update(wishlist);
	}
    
    // RESTful API method for Delete operation
    @DeleteMapping("/wishlist/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
    
   
}