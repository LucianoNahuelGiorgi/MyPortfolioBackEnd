package com.project.myportfolio.services;

import com.project.myportfolio.exceptions.AboutMeNotFoundException;
import com.project.myportfolio.models.AboutMe;
import com.project.myportfolio.repositories.AboutMeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutMeService {
    private final AboutMeRepo aboutMeRepo;

    @Autowired
    public AboutMeService(AboutMeRepo aboutMeRepo) {
        this.aboutMeRepo = aboutMeRepo;
    }

    public AboutMe addAboutMe(AboutMe aboutMe) {
        return aboutMeRepo.save(aboutMe);
    }

    public List<AboutMe> findAllAboutMe() {
        return aboutMeRepo.findAll();
    }

    public AboutMe findAboutMeById(Long id) {
        return aboutMeRepo.findAboutMeById(id).orElseThrow(()-> new AboutMeNotFoundException("About Me id: " + id + "was not found"));
    }

    public AboutMe updateAboutMe(AboutMe aboutMe) {
        return aboutMeRepo.save(aboutMe);
    }

    public void deleteAboutMe(Long id) {
        aboutMeRepo.deleteById(id);
    }
}