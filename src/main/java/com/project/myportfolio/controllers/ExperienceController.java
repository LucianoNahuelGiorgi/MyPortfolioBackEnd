package com.project.myportfolio.controllers;

import com.project.myportfolio.models.Experience;
import com.project.myportfolio.services.ExperienceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experience")
public class ExperienceController {
    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Experience>> getAllExperience () {
        List<Experience> experience = experienceService.findAllExperience();
        return new ResponseEntity<>(experience, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Experience> getExperienceById(@PathVariable("id") Long id) {
        Experience experience = experienceService.findExperienceById(id);
        return new ResponseEntity<>(experience, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Experience> addExperience(@RequestBody Experience experience) {
        Experience addExperience = experienceService.addExperience(experience);
        return new ResponseEntity<>(addExperience, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Experience> updateExperience(@RequestBody Experience experience) {
        Experience updateExperience = experienceService.updateExperience(experience);
        return new ResponseEntity<>(updateExperience, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteExperience(@PathVariable("id") Long id) {
        experienceService.deleteExperience(id);
    }
}