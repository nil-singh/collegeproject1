package com.custotomer.customer.service;

import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.custotomer.customer.model.Admin;
import com.custotomer.customer.reposit.AdminRepository;
 
@Service
@Transactional
public class AdminService {
 
    @Autowired
    private AdminRepository repo1;
     
    public List<Admin> listAll() {
        return repo1.findAll();
    }
    public Admin getadmin(String name, String password)
    {
    	return repo1.loginadmin(name, password);
    }
    public void save(Admin admin) {
        repo1.save(admin);
    }
     
    public Admin get(Integer id) {
        return repo1.findById(id).get();
    }
    
    public void update(Admin admin) {
       repo1.save(admin);
    }
     
    public void delete(Integer id) {
        repo1.deleteById(id);
    }
    
}