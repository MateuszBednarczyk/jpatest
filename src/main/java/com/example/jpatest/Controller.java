package com.example.jpatest;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    private dbService db;

    public Controller(dbService db) {
        this.db = db;
    }

    @GetMapping("/all")
    public Iterable <Customers> findAll(){

        return db.getAllUsers();

    }

    @PostMapping("/add")
    public void addNewCustomer(@RequestBody Customers customer){

        db.addNewCustomer(customer);

    }

}
