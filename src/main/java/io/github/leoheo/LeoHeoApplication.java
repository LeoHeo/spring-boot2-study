package io.github.leoheo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
//@EnableOAuth2Client
@EnableOAuth2Sso
public class LeoHeoApplication extends WebSecurityConfigurerAdapter {

  public static void main(String[] args) {
    SpringApplication.run(LeoHeoApplication.class, args);
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
          .mvcMatchers("/").permitAll()               // 로그인하지 않아도 허용하는 URL
          .mvcMatchers("/admin/**").hasRole("ADMIN")  // 해당 ROLE만 접근가능
        .anyRequest().authenticated();
  }
}
