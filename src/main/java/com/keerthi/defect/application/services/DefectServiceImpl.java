package com.keerthi.defect.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthi.defect.application.entities.Defect;
import com.keerthi.defect.application.repositories.DefectRepository;

@Service
public class DefectServiceImpl implements DefectService {

	@Autowired
	DefectRepository defectRepository;
	
	
	public void saveDefect(Defect defect) {
	    defectRepository.save(defect);
	}

	public List<Defect> getAllDefect() {
		return defectRepository.findAll();
	}

	
	public void updateDefect(Defect defect) {
		defectRepository.save(defect);	
	}

	public void deleteDefectById(long defectId) {
        defectRepository.deleteById(defectId);	
	}

	public Defect findById(long defectId) {
		return defectRepository.findByDefectId(defectId);
	}

	



}
