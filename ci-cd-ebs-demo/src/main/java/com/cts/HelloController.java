package com.cts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String sayHi() {
		return "Welcome to CI-CD-EBS Demo...";
	}
	
	@GetMapping("/hi")
	public String sayHi1() {
		return "Hi from CI-CD-EBS Demo...";
	}
	
	@GetMapping("/hello/{name}")
	public String sayhello(@PathVariable("name") String  name) {
		return "Hello "+name+" !............";
	}
	
}
