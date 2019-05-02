package com.keerthi.defect.application.services;

import java.util.List;



import com.keerthi.defect.application.entities.Module;

public interface ModuleService {

	void saveModule(Module module);
	List<Module> getAllModule();
	void updateModule(Module module);
    void deleteModuleById(long moduleId);
    Module findById(long moduleId);
}
