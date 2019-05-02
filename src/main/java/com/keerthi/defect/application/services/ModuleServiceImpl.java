package com.keerthi.defect.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.keerthi.defect.application.entities.Module;
import com.keerthi.defect.application.repositories.ModuleRepository;

@Service
public class ModuleServiceImpl implements ModuleService {

	@Autowired
	ModuleRepository moduleRepository;
	
	public void saveModule(Module module) {
		moduleRepository.save(module);
	}
	
	public List<Module> getAllModule(){
		return moduleRepository.findAll();
	}
	
	public void updateModule(Module module) {
		moduleRepository.save(module);
	}

	public void deleteModuleById(long moduleId) {
		moduleRepository.deleteById(moduleId);
	}

	public Module findById(long moduleId) {
		return moduleRepository.findBymoduleId(moduleId);
	}

	


	
}
