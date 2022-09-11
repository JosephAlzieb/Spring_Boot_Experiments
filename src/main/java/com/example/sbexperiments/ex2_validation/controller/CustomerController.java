package com.example.sbexperiments.ex2_validation.controller;

import com.example.sbexperiments.ex2_validation.model.Customer;
import java.util.List;
import java.util.stream.Collectors;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

  private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

  @PostMapping
  public void createCustomer(@RequestBody @Valid Customer customer) {
    LOGGER.info(
        "RequestBody: firstName: {}, phoneNumber: {}",
        customer.getFirstName(),
        customer.getPhoneNumber()
    );
  }
}