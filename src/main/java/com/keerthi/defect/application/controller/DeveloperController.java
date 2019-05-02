package com.keerthi.defect.application.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.keerthi.defect.application.entities.Developer;
import com.keerthi.defect.application.services.DeveloperService;

@RestController
public class DeveloperController {

	@Autowired
	DeveloperService developerService;
	
	@CrossOrigin("http://localhost:3000")
	@PostMapping("/saveDeveloper")
	public HttpStatus createDeveloper(@Valid @RequestBody Developer developer) {
		developerService.saveDeveloper(developer);
		return HttpStatus.CREATED;	
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/findAllDeveloper")
	public List<Developer> findAll(){
		return developerService.getAllDeveloper();	
	}
	
	@CrossOrigin("http://localhost:3000")
	@PutMapping("/updateDeveloper")
	public ResponseEntity<Developer> updateDeveloper(@Valid @RequestBody Developer developer){
		developerService.updateDeveloper(developer);
		return new ResponseEntity<Developer>(developer,HttpStatus.NO_CONTENT);	
	}
	
	@CrossOrigin("http://localhost:3000")
	@DeleteMapping("/deleteDeveloper/{developerId}")
	public ResponseEntity<Developer> deleteDeveloper(@PathVariable ("developerId") long developerId){
		developerService.deleteDeveloperById(developerId);
		return new ResponseEntity<Developer>(HttpStatus.NO_CONTENT);	
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("findAllDevelopers/{developerId}")
	public ResponseEntity<Developer> getAllDeveloper(@PathVariable("developerId") long developerId){
		return new ResponseEntity<Developer>(developerService.findById(developerId),HttpStatus.OK);	
	}
	
}
