package Connekt1onApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

  @GetMapping("/login")
  public String welcome(){
    return "Welcome, Connekt1on Placeholder";
  }

}
