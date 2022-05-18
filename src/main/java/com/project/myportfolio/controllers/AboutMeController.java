package com.project.myportfolio.controllers;

import com.project.myportfolio.models.AboutMe;
import com.project.myportfolio.services.AboutMeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/about-me")
public class AboutMeController {
    private final AboutMeService aboutMeService;

    public AboutMeController(AboutMeService aboutMeService) {
        this.aboutMeService = aboutMeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<AboutMe>> getAllAboutMe () {
        List<AboutMe> aboutMe = aboutMeService.findAllAboutMe();
        return new ResponseEntity<>(aboutMe, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<AboutMe> getAboutMeById(@PathVariable("id") Long id) {
        AboutMe aboutMe = aboutMeService.findAboutMeById(id);
        return new ResponseEntity<>(aboutMe, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<AboutMe> addAboutMe(@RequestBody AboutMe aboutMe) {
        AboutMe addAboutMe = aboutMeService.addAboutMe(aboutMe);
        return new ResponseEntity<>(addAboutMe, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<AboutMe> updateAboutMe(@RequestBody AboutMe aboutMe) {
        AboutMe updateAboutMe = aboutMeService.updateAboutMe(aboutMe);
        return new ResponseEntity<>(updateAboutMe, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAboutMe(@PathVariable("id") Long id) {
        aboutMeService.deleteAboutMe(id);
    }
}