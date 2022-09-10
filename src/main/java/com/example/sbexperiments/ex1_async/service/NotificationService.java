package com.example.sbexperiments.ex1_async.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class NotificationService {

  public void sendTextMessage(String mobile) {

    // dummy logic to call 3rd party services
    sleep(2);
    System.out.println("called 3rd party to send text message : " + Thread.currentThread().getName());

  }


  private void sleep(int args) {
    try {
      TimeUnit.SECONDS.sleep(args);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}