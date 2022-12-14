package com.custotomer.customer.service;
import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.custotomer.customer.model.Cart;
import com.custotomer.customer.model.Wishlist;
import com.custotomer.customer.reposit.WishlistRepository;
 
@Service
@Transactional
public class WishListService {
 
    @Autowired
    private WishlistRepository repo1;
     
    
    public List<Wishlist> listallbyid(Integer autoid)
    {
    	return repo1.getwishlist(autoid);
    }
     
    public void save(Wishlist wishlist) {
        repo1.save(wishlist);
    }
     
    public Wishlist get(Integer id) {
        return repo1.findById(id).get();
    }
    
    public void update(Wishlist wishlist) {
       repo1.save(wishlist);
    }
     
    public void delete(Integer id) {
        repo1.deleteById(id);
    }
    
}