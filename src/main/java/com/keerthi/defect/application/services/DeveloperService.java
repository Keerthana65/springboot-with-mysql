package com.keerthi.defect.application.services;

import java.util.List;

import com.keerthi.defect.application.entities.Developer;

public interface DeveloperService {
 void saveDeveloper(Developer developer);
 List<Developer> getAllDeveloper();
 void updateDeveloper(Developer developer);
 void deleteDeveloperById(Long developerId);
 Developer findById(long developerId);
 
}
