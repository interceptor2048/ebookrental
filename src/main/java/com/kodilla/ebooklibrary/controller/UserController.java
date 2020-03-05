package com.kodilla.ebooklibrary.controller;

import com.kodilla.ebooklibrary.domain.LoginDto;
import com.kodilla.ebooklibrary.domain.RegisteredDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/user/")
class UserController {
  private Random rnd = new Random();

  @PostMapping(path = "login")
  public int login(@RequestBody LoginDto loginDto) {
    if (rnd.nextBoolean())
      return rnd.nextInt(50) + 1;
    else
      return -1;
  }

  @PostMapping(path = "register")
  public RegisteredDto register(@RequestBody LoginDto loginDto) {
    int id = rnd.nextInt(50) + 1;
    boolean isNew = rnd.nextBoolean();
    return new RegisteredDto(id, isNew);
  }
}
