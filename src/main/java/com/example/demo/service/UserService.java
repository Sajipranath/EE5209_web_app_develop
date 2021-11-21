package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {
	@Autowired
private UserRepo userRepo;  
	
	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

    public User adduser(User user) {
    	return userRepo.save(user);
    }
	
	public List<User> findusers(){
		return userRepo.findAll();
	}

	public User updateuser(User user) {
		return userRepo.save(user);
	}
	
	public Optional<User> finduserById(long id) {
		return userRepo.findById(id);
	}
	
	public void deleteuserById(long id) {
		userRepo.deleteById(id);
	}
}
