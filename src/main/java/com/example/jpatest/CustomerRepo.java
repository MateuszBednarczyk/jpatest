package com.example.jpatest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customers, Long> {
    List<Customers> findAll();
}