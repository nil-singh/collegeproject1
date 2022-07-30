package com.custotomer.customer.reposit;


import org.springframework.data.jpa.repository.JpaRepository;

import com.custotomer.customer.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	 
	}
