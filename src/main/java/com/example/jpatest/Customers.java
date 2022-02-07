package com.example.jpatest;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customers {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long customerId;
  private String customerName;


  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

}
