package com.example.app1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.mylib.HelloService;

@RestController
public class HelloController {

  @GetMapping("/")
  public String greeting() {
    new HelloService().message();
    return "Hello World3 nl 123qwqw!";
  }
}
