package com.custotomer.customer.reposit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.custotomer.customer.model.Users;
 
@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
   @Query(value="select * from users where name = :name and password = :password", nativeQuery=true)
   Users loginuser(@Param("name") String name, @Param("password") String password);
   
   @Query(value="select * from users where name = :name", nativeQuery=true)
   Users getuser(@Param("name") String name);
}