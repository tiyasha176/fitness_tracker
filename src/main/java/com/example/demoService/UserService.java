package com.example.demoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demoRepository.UserRepository;

@Service

public class UserService {
	@Autowired
	private UserRepository userRepository;
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
		
	}
}
