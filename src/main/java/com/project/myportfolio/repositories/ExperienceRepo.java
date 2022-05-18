package com.project.myportfolio.repositories;

import com.project.myportfolio.models.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExperienceRepo extends JpaRepository<Experience, Long> {
    Optional<Experience> findExperienceById(Long id);
}