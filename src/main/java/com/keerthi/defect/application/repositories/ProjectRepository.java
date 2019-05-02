package com.keerthi.defect.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.keerthi.defect.application.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

	Project findByprojectId(Long projectId);
}
