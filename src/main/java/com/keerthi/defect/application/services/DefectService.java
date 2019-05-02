package com.keerthi.defect.application.services;

import java.util.List;

import com.keerthi.defect.application.entities.Defect;

public interface DefectService {
	void saveDefect(Defect defect);  //Add Defect
	List<Defect> getAllDefect(); //View All Defect Details
	void updateDefect(Defect defect); //Update Defect
	void deleteDefectById(long defectId); //DeleteDefect
	Defect findById(long defectId);
}
