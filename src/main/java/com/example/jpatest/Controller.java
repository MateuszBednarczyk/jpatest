package com.example.jpatest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private CustomerRepo customerRepo;

    public Controller(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @GetMapping("/all")
    public @ResponseBody
    Iterable <Customers> getAllUsers() {
        return customerRepo.findAll();
    }

}
