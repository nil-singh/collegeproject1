package com.custotomer.customer.service;
import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.custotomer.customer.model.Stocks;
import com.custotomer.customer.reposit.StocksRepository;
 
@Service
@Transactional
public class StocksService {
 
    @Autowired
    private StocksRepository repo1;
     
    public List<Stocks> listAll() {
        return repo1.findAll();
    }
     
    public void save(Stocks stocks) {
        repo1.save(stocks);
    }
     
    public Stocks get(Integer id) {
        return repo1.findById(id).get();
    }
    
    public void update(Stocks stocks) {
       repo1.save(stocks);
    }
     
    public void delete(Integer id) {
        repo1.deleteById(id);
    }
    
}