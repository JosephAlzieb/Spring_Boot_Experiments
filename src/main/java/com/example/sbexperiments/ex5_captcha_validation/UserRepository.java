package com.example.sbexperiments.ex5_captcha_validation;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

  private List<User> users = new ArrayList<>();

  public List<User> getUsers() {
    return users;
  }

  public void addUser(User user) {
    this.users.add(user);
  }

  public void setUsers(List<User> users) {
    users.remove(users);
  }
}
