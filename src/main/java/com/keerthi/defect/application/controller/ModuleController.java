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
import com.keerthi.defect.application.entities.Module;
import com.keerthi.defect.application.services.ModuleService;

@RestController
public class ModuleController {

	@Autowired
	ModuleService moduleService;
	
	@CrossOrigin("http://localhost:3000")
	@PostMapping("/saveModule")
	public HttpStatus createModule(@Valid @RequestBody Module module) {
		moduleService.saveModule(module);
		return HttpStatus.CREATED;		
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/findAllModule")
	public List<Module> findAll(){
		return moduleService.getAllModule();
	}

	@PutMapping("/updateModule")
	public ResponseEntity<Module> updateModule(@Valid @RequestBody Module module){
		moduleService.updateModule(module);
		return new ResponseEntity<Module>(module, HttpStatus.NO_CONTENT);	
	}
	
	@DeleteMapping("/deleteModule/{moduleId}")
	public ResponseEntity<Module> deleteModule(@PathVariable("moduleId") long moduleId){
		moduleService.deleteModuleById(moduleId);
		return new ResponseEntity<Module>(HttpStatus.NO_CONTENT);
		
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/findAllModules/{moduleId}")
	public ResponseEntity<Module> getAllModule(@PathVariable("moduleId")long moduleId){
		return new ResponseEntity<Module>(moduleService.findById(moduleId),HttpStatus.OK);
	}
	
}
