package com.example.jpatest;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class dbService {

    private CustomerRepo customerRepo;

    public dbService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public @ResponseBody
    Iterable <Customers> getAllUsers() {
        return customerRepo.findAll();
    }

    public Customers addNewCustomer(Customers customer){

        return customerRepo.save(customer);

    }



}
