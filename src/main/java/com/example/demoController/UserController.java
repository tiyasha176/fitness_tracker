package com.example.demoController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demoService.UserService;



@RestController
public class UserController {
	private UserService userService;
	@PostMapping("/user")
	public String adduser(@RequestBody User user) {
		userService.addUser(user);
		return "user added";	
	}
}
