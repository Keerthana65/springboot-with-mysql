package com.keerthi.defect.application.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.keerthi.defect.application.entities.User;
import com.keerthi.defect.application.services.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@CrossOrigin("http://localhost:3000")
	@PostMapping("/saveUser")
	public HttpStatus createUser(@Valid @RequestBody User user) {
		userService.saveUser(user);
		return HttpStatus.CREATED;		
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/findAllUser")
	public List<User> findAll(){
		return userService.getAllUser();
	}
	
	@PutMapping("/updateUser")
	public ResponseEntity<User> updateUser(@Valid @RequestBody User user){
		userService.updateUser(user);
		return new ResponseEntity<User>(user, HttpStatus.NO_CONTENT);	
	}
	
//	@DeleteMapping("/deleteUser")
//	public ResponseEntity<User> deleteUser(@PathVariable("userId") int userId){
//		userService.deleteUserById(userId);
//		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
//		
//	}
}
