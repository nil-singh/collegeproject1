package com.custotomer.customer.service;


import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.custotomer.customer.model.Users;
import com.custotomer.customer.reposit.UsersRepository;
 
@Service
@Transactional
public class UsersService {
 
    @Autowired
    private UsersRepository repo6;
    
    public Users loginuser(String name, String password)
    {
    	return repo6.loginuser(name, password);
    }
    
    public Users getUser(String name)
    {
    	return repo6.getuser(name);
    }
     
    public List<Users> listAll() {
        return repo6.findAll();
    }
     
    public void save(Users user) {
        repo6.save(user);
    }
     
    public Users get(Integer id) {
        return repo6.findById(id).get();
    }
    
    public void update(Users user) {
       repo6.save(user);
    }
     
    public void delete(Integer id) {
        repo6.deleteById(id);
    }
    
}