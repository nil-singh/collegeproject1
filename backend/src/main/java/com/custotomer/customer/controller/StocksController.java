package com.custotomer.customer.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

import com.custotomer.customer.model.Stocks;
import com.custotomer.customer.service.StocksService;

 
@RestController
public class StocksController {
 
    @Autowired
    private StocksService service;
     
    // RESTful API methods for Retrieval operations
    @GetMapping("/stocks")
    public List<Stocks> list() {
        return service.listAll();
    }
    @GetMapping("/stocks/{id}")
    public ResponseEntity<Stocks> get(@PathVariable Integer id) {
        try {
        	Stocks stocks = service.get(id);
            return new ResponseEntity<Stocks>(stocks, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Stocks>(HttpStatus.NOT_FOUND);
        }      
    }
    // RESTful API method for Create operation
    @PostMapping("/stocks")
    public void add(@RequestBody Stocks stocks) {
        service.save(stocks);
    }
     
    @PutMapping("/stocks/{id}")
	public void update(@RequestBody Stocks stocks) {
		 service.update(stocks);
	}
    
    // RESTful API method for Delete operation
    @DeleteMapping("/stocks/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
    
   
}