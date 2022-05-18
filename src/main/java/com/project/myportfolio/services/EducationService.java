package com.project.myportfolio.services;

import com.project.myportfolio.exceptions.EducationNotFoundException;
import com.project.myportfolio.models.Education;
import com.project.myportfolio.repositories.EducationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {
    private final EducationRepo educationRepo;

    @Autowired
    public EducationService(EducationRepo educationRepo) {
        this.educationRepo = educationRepo;
    }

    public Education addEducation(Education education) {
        return educationRepo.save(education);
    }

    public List<Education> findAllEducation() {
        return educationRepo.findAll();
    }

    public Education findEducationById(Long id) {
        return educationRepo.findEducationById(id).orElseThrow(()-> new EducationNotFoundException("Education id: " + id + "was not found"));
    }

    public Education updateEducation(Education education) {
        return educationRepo.save(education);
    }

    public void deleteEducation(Long id) {
        educationRepo.deleteById(id);
    }
}