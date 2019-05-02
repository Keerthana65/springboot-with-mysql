package com.keerthi.defect.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.keerthi.defect.application.entities.User;
import com.keerthi.defect.application.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;
	
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	public List<User> getAllUser(){
		return userRepository.findAll();
	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void deleteUserById(int userId) {
		userRepository.deleteById((long) userId);
		
	}

}
