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
import com.keerthi.defect.application.entities.Defect;
import com.keerthi.defect.application.services.DefectService;

@RestController
public class DefectController {

	@Autowired
	DefectService defectService;
	

	@CrossOrigin("http://localhost:3000")
	@PostMapping("/saveDefect")
	public HttpStatus createDefect(@Valid @RequestBody Defect defect) {
		defectService.saveDefect(defect);
		return HttpStatus.CREATED;	
	}
	

	@CrossOrigin("http://localhost:3000")
	@GetMapping("/findAllDefect")
	public List<Defect> findAll(){
		return defectService.getAllDefect();	
	}
	
	@CrossOrigin("http://localhost:3000")
	@PutMapping("/updateDefect")
	public ResponseEntity<Defect> updateDefect(@Valid @RequestBody Defect defect){
		defectService.updateDefect(defect);
		return new ResponseEntity<Defect>(defect,HttpStatus.NO_CONTENT);	
	}
	
	@CrossOrigin("http://localhost:3000")
	@DeleteMapping("/deleteDefect/{defectId}")
	public ResponseEntity<Defect> deleteDefect(@PathVariable("defectId") long defectId){
		defectService.deleteDefectById(defectId);
		return new ResponseEntity<Defect>(HttpStatus.NO_CONTENT);	
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/findAllDefects/{defectId}")
	public ResponseEntity<Defect> getAllDefect(@PathVariable("defectId") long defectId ){
		return new ResponseEntity<Defect>(defectService.findById(defectId),HttpStatus.OK);	
	}
}
