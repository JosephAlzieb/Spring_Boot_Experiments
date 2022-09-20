package com.example.sbexperiments.ex4_swagger.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class WebController {
  private List<String> users = List.of("user1", "user2", "user3");


  @GetMapping("/users")
  public List<String> getUser() {
    return users;
  }

  @PostMapping("/users/{user}")
  public void addUser(@PathVariable String user){
    users.add(user);
  }
}
