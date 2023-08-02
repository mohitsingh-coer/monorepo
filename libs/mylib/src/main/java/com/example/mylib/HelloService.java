package com.example.mylib;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

  public String message() {
    return "Hello World from mylib 2!";
  }
}
