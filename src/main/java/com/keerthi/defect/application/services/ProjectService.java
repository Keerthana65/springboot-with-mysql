package com.keerthi.defect.application.services;


import java.util.List;

import com.keerthi.defect.application.entities.Project;

public interface ProjectService {
	void saveProject(Project project);
	List<Project> getAllProject();
    void updateProject(Project project);
    void deleteProjectById(long projectId);  
    Project findById(long projectId);
}
