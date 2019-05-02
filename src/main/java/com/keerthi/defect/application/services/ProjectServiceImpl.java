package com.keerthi.defect.application.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthi.defect.application.entities.Project;
import com.keerthi.defect.application.repositories.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectRepository projectRepository;
	
	public void saveProject(Project project) {
		projectRepository.save(project);
	}
	
	public List<Project> getAllProject(){
		return projectRepository.findAll();
		
	}

	public void updateProject(Project project) {
		projectRepository.save(project);	
	}

	public void deleteProjectById(long projectId) {
		projectRepository.deleteById(projectId);
	}

	public Project findById(long projectId) {
		return projectRepository.findByprojectId(projectId);
	}

	
	
}
