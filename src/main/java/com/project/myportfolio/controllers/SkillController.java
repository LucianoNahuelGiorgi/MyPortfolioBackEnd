package com.project.myportfolio.controllers;

import com.project.myportfolio.models.Skill;
import com.project.myportfolio.services.SkillService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skill")
public class SkillController {
    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Skill>> getAllSkill () {
        List<Skill> skill = skillService.findAllSkill();
        return new ResponseEntity<>(skill, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Skill> getSkillById(@PathVariable("id") Long id) {
        Skill skill = skillService.findSkillById(id);
        return new ResponseEntity<>(skill, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Skill> addSkill(@RequestBody Skill skill) {
        Skill addSkill = skillService.addSkill(skill);
        return new ResponseEntity<>(addSkill, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Skill> updateSkill(@RequestBody Skill skill) {
        Skill updateSkill = skillService.updateSkill(skill);
        return new ResponseEntity<>(updateSkill, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSkill(@PathVariable("id") Long id) {
        skillService.deleteSkill(id);
    }
}