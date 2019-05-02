package com.keerthi.defect.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthi.defect.application.entities.Developer;
import com.keerthi.defect.application.repositories.DeveloperRepository;

@Service
public class DeveloperServiceImpl implements DeveloperService {

	@Autowired
	DeveloperRepository developerRepository;

	
	public void saveDeveloper(Developer developer) {
		developerRepository.save(developer);	
	}


	public List<Developer> getAllDeveloper() {
		return developerRepository.findAll();
	}


	public void updateDeveloper(Developer developer) {
		developerRepository.save(developer);
	}


	public void deleteDeveloperById(Long developerId) {
		developerRepository.deleteById(developerId);
	}


	public Developer findById(long developerId) {
		return developerRepository.findBydeveloperId(developerId);
	}

	

	
}
