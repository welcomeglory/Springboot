package edu.ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String hello() {
		return "<h1>HelloWorld</h1>";
	}
	@GetMapping("/hello")
	public String hello2() {
		return "<h1>나는 홍길동입니다.</h1>";
	}
	
	@GetMapping("/human")
	public String human() {
		return "<h1>나는 사람입니다.</h1>";
	}
	
	@GetMapping("/success")
	public String success() {
		return "<h1>성공성공성공!!!</h1>";
	}
	
	
}
