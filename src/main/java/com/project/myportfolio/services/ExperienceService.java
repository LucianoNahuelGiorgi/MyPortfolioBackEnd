package com.project.myportfolio.services;

import com.project.myportfolio.exceptions.ExperienceNotFoundException;
import com.project.myportfolio.models.Experience;
import com.project.myportfolio.repositories.ExperienceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {
    private final ExperienceRepo experienceRepo;

    @Autowired
    public ExperienceService(ExperienceRepo experienceRepo) {
        this.experienceRepo = experienceRepo;
    }

    public Experience addExperience(Experience experience) {
        return experienceRepo.save(experience);
    }

    public List<Experience> findAllExperience() {
        return experienceRepo.findAll();
    }

    public Experience findExperienceById(Long id) {
        return experienceRepo.findExperienceById(id).orElseThrow(()-> new ExperienceNotFoundException("Experience id: " + id + "was not found"));
    }

    public Experience updateExperience(Experience experience) {
        return experienceRepo.save(experience);
    }

    public void deleteExperience(Long id) {
        experienceRepo.deleteById(id);
    }
}