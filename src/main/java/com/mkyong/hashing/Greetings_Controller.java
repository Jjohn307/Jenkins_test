package com.mkyong.hashing;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings_Controller{
  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();
  @RequestMapping("/Hello")
  public Greetings greetings(@RequestParam(value="name", defaultValue="World") String name)
  {
  		return new Greetings(counter.incrementAndGet(),
              String.format(template, name));
  }
}