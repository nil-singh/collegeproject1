package com.custotomer.customer.reposit;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//import com.custotomer.customer.model.Cart;
import com.custotomer.customer.model.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Integer> {
	@Query(value="select * from wishlist where autoid = :autoid", nativeQuery=true)
	   List<Wishlist> getwishlist(@Param("autoid") Integer autoid);
	}
