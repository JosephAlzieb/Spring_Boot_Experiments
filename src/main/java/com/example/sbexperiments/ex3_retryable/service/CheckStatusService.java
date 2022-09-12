package com.example.sbexperiments.ex3_retryable.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

@Service
public class CheckStatusService {

  public String checkStatus(String trackingNumber) {

    System.out.println("calling another service to get status!!");
    throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR);

    // return "approved";
  }
}