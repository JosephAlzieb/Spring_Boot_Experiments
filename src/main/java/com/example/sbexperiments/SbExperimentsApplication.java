package com.example.sbexperiments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class SbExperimentsApplication {

  public static void main(String[] args) {
    SpringApplication.run(SbExperimentsApplication.class, args);
  }

}
