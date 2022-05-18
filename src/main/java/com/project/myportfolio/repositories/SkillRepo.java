package com.project.myportfolio.repositories;

import com.project.myportfolio.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SkillRepo extends JpaRepository<Skill, Long> {
    Optional<Skill> findSkillById(Long id);
}