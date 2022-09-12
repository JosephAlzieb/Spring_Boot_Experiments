package com.example.sbexperiments.ex3_retryable.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

@Service
public class CheckStatusService {

  public String checkStatus(String trackingNumber) {
    return "approved";
  }
}