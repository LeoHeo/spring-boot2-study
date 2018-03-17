package io.github.leoheo.post;

import java.security.Principal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

  @GetMapping("/")
  public String greet() {
    return "test";
  }

  @GetMapping("/oauth/token")
  public Principal test(Principal principal) {
    return principal;
  }

  @GetMapping("/admin")
  public String test3() {
    return "test3";
  }

  @GetMapping("/admin/test")
  public Principal test4(Principal principal) {
    return principal;
  }
}
