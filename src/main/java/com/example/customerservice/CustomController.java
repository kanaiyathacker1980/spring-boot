package com.example.customerservice;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {

  @GetMapping("customer/{customerId}")
  public String getCustomer(@PathVariable long customerId) {
    return LocalDateTime.now().toString();
  }


}
