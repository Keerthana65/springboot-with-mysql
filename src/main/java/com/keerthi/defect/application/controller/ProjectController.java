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
import com.keerthi.defect.application.entities.Project;
import com.keerthi.defect.application.services.ProjectService;

@RestController

public class ProjectController {

	@Autowired
	ProjectService projectService;
	
	@CrossOrigin("http://localhost:3000")
	@PostMapping("/saveProject")
	public HttpStatus createProject(@Valid @RequestBody Project project) {
		projectService.saveProject(project);
		return HttpStatus.CREATED;
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/findAllProject")
	public List<Project> findAll(){
		return projectService.getAllProject();
	}
	
	@CrossOrigin("http://localhost:3000")
	@PutMapping("/updateProject")
	public ResponseEntity<Project> updateProject(@Valid @RequestBody Project project){
		projectService.updateProject(project);
		return new ResponseEntity<Project>(project,HttpStatus.NO_CONTENT);	
	}
	
	@CrossOrigin("http://localhost:3000")
	@DeleteMapping("/deleteProject/{projectId}")
    public ResponseEntity<Project> deleteProject(@PathVariable("projectId") long projectId){
    	projectService.deleteProjectById(projectId);
		return new ResponseEntity<Project>(HttpStatus.NO_CONTENT);	
    }
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/findAllProjects/{projectId}")
	public ResponseEntity<Project> getAllProject(@PathVariable("projectId") long projectId){
		return new ResponseEntity<Project>(projectService.findById(projectId),HttpStatus.OK);
		
	}
	
}
