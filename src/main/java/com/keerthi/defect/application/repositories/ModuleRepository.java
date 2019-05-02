package com.keerthi.defect.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.keerthi.defect.application.entities.Module;

public interface ModuleRepository extends JpaRepository<Module, Long> {

	Module findBymoduleId(Long moduleId);
}
