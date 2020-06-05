package com.melody1music.project.music.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		return ("<H1>Welcome</H1>");
	}
	
	@GetMapping("/user")
	public String user() {
		return ("<H1>Welcome User</H1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("<H1>Welcome Admin</H1>");
	}

}
