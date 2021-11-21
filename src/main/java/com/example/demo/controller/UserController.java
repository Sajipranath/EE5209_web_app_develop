package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/users")
	public List<User> getusers(){
		return userService.findusers();
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getuserById(@PathVariable Long id){
		return userService.finduserById(id);
		
	}
	
	@PostMapping("/add")
	public User adduser(@RequestBody User user) {
		return userService.adduser(user);	
		
	}
	
	@PostMapping("/update")
	public User updateuser(@RequestBody User user) {
		return userService.updateuser(user);		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletuserById(@PathVariable Long id){
		 userService.deleteuserById(id);		
	}
}
