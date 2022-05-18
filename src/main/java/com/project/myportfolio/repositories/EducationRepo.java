package com.project.myportfolio.repositories;

import com.project.myportfolio.models.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EducationRepo extends JpaRepository<Education, Long> {
    Optional<Education> findEducationById(Long id);
}