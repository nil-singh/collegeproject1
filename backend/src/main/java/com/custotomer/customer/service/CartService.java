package com.custotomer.customer.service;
import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.custotomer.customer.model.Cart;
import com.custotomer.customer.reposit.CartRepository;
 
@Service
@Transactional
public class CartService {
 
    @Autowired
    private CartRepository repo1;
     
    public List<Cart> listAll() {
        return repo1.findAll();
    }
    
    public List<Cart> listallbyid(Integer autoid)
    {
    	return repo1.getcart(autoid);
    }
     
    public void save(Cart cart) {
        repo1.save(cart);
    }
     
    public Cart get(Integer id) {
        return repo1.findById(id).get();
    }
    
    public void update(Cart cart) {
       repo1.save(cart);
    }
     
    public void delete(Integer id) {
        repo1.deleteById(id);
    }
    
    
}