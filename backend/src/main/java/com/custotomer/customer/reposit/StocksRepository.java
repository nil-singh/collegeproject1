package com.custotomer.customer.reposit;


import org.springframework.data.jpa.repository.JpaRepository;

import com.custotomer.customer.model.Stocks;

public interface StocksRepository extends JpaRepository<Stocks, Integer> {
	 
	}
