package com.keerthi.defect.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.keerthi.defect.application.entities.Defect;

public interface DefectRepository extends JpaRepository<Defect,Long> {

	Defect findByDefectId(Long defectId);
}
