package com.keerthi.defect.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.keerthi.defect.application.entities.Developer;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {

	Developer findBydeveloperId(long developerId);
}
