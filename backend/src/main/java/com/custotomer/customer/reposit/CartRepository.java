package com.custotomer.customer.reposit;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.custotomer.customer.model.Cart;


@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
	@Query(value="select * from cart where autoid = :autoid", nativeQuery=true)
	   List<Cart> getcart(@Param("autoid") Integer autoid);
	}

