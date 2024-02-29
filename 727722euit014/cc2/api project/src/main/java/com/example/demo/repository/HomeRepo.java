package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Home;

@Repository
public interface HomeRepo extends JpaRepository<Home,Integer> {
    
    // @Query("Select u from Home u where u.serviceId=?1")
    // Optional<Home> findById(int serviceId);

    @Query("Select u from Home u where u.serviceId=?1")
    Optional<Home> findById(int serviceId);


}
