package com.keerthi.defect.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.keerthi.defect.application.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
