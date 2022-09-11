package com.example.sbexperiments.ex2_validation.model;

import com.example.sbexperiments.ex2_validation.validation.Phone;
import javax.validation.constraints.NotBlank;

public class Customer {

  @NotBlank
  private String firstName;

  @NotBlank
  @Phone
  private String phoneNumber;

  public Customer() {

  }

  public Customer(String firstName, String phoneNumber) {
    this.firstName = firstName;
    this.phoneNumber = phoneNumber;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}

