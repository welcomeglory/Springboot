package edu.ex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@GetMapping("/")
	public String hello() {
		return "helloworld!!!!";
	}
	@GetMapping("/hello2")
	public String hello2() {
		return "<h1>helloworld!!!!</h1>";
	}
	


}
