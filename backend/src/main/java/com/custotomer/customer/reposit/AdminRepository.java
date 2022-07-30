package com.custotomer.customer.reposit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.custotomer.customer.model.Admin;
import com.custotomer.customer.model.Users;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	@Query(value="select * from admin where admin_name = :name and password = :password", nativeQuery=true)
	   Admin loginadmin(@Param("name") String name, @Param("password") String password);
	}

