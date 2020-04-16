package com.orginaldream.backstage.demo.rest.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/demo/")
public class DemoController {
  @Autowired
  private RestTemplate restTemplate;
  @GetMapping("/demo/{user}")
  public String sayHelloWorld(@PathVariable String user){
    System.out.println(restTemplate.postForEntity("http://dream-login/login/yinyuan", Map.class).getBody());
    return "hello,world to "+user;
  }

}
