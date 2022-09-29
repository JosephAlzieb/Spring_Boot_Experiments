package com.example.sbexperiments.ex5_captcha_validation;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

  private final List<User> users = new ArrayList<>();

  public List<User> getUsers() {
    return users;
  }

  public void addUser(User user) {
    this.users.add(user);
  }

  public void deleteUser(User user) {
    users.remove(user);
  }
}
