package com.project.myportfolio.repositories;

import com.project.myportfolio.models.AboutMe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AboutMeRepo extends JpaRepository<AboutMe, Long> {
    Optional<AboutMe> findAboutMeById(Long id);
}