package io.github.leoheo.controller;

import java.security.Principal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

//  @GetMapping("/")
//  public String greet() {
//    return "test2";
//  }

  @GetMapping("/admin")
  public String test3() {
    return "test3";
  }

  @GetMapping("/admin/test")
  public Principal test4(Principal principal) {
    return principal;
  }

  @GetMapping("/test")
  public Principal test5(Principal principal) {
    return principal;
  }

  @GetMapping("/test2")
  public String test6() {
    return "test";
  }

}
