package com.project.myportfolio.controllers;

import com.project.myportfolio.models.Education;
import com.project.myportfolio.services.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/education")
public class EducationController {
    private final EducationService educationService;

    @Autowired
    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Education>> getAllEducation () {
        List<Education> education = educationService.findAllEducation();
        return new ResponseEntity<>(education, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Education> getEducationById(@PathVariable("id") Long id) {
        Education education = educationService.findEducationById(id);
        return new ResponseEntity<>(education, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Education> addEducation(@RequestBody Education education) {
        Education addEducation = educationService.addEducation(education);
        return new ResponseEntity<>(addEducation, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Education> updateEducation(@RequestBody Education education) {
        Education updateEducation = educationService.updateEducation(education);
        return new ResponseEntity<>(updateEducation, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEducation(@PathVariable("id") Long id) {
        educationService.deleteEducation(id);
    }
}