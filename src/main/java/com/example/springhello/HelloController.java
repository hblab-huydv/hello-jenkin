package com.example.springhello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class HelloController {
	@RequestMapping(value = "/")
	   public String hello() {
	      return "Hello World from Tomcat";
		}
	
	@RequestMapping(value = "/test")
	   public String test() {
	      return "Test jenkin";
		}
}
