package io.github.leoheo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login/**")
public class LoginController {

  @RequestMapping("/oauth2")
  public String login() {
    return "test";
  }
}
