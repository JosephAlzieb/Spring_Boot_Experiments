package com.example.sbexperiments.ex1_async.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;
/**
 * Sync : Blocking Way of programming.
 *        one thread will wait until the execution finished.
 *
 * Async : None-Blocking Way of programming.
 *         one thread will not wait until the execution finished.
 *
 * Fire and Forget : None-Blocking Way of programming.
 *                   this we can achieve using Async-Programming
 */
@Service
public class NotificationService {

  @Async
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