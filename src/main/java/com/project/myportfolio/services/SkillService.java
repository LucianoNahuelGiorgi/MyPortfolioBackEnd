package com.project.myportfolio.services;

import com.project.myportfolio.exceptions.SkillNotFoundException;
import com.project.myportfolio.models.Skill;
import com.project.myportfolio.repositories.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {
    private final SkillRepo skillRepo;

    @Autowired
    public SkillService(SkillRepo skillRepo) {
        this.skillRepo = skillRepo;
    }

    public Skill addSkill(Skill skill) {
        return skillRepo.save(skill);
    }

    public List<Skill> findAllSkill() {
        return skillRepo.findAll();
    }

    public Skill findSkillById(Long id) {
        return skillRepo.findSkillById(id).orElseThrow(()-> new SkillNotFoundException("Skill id: " + id + "was not found"));
    }

    public Skill updateSkill(Skill skill) {
        return skillRepo.save(skill);
    }

    public void deleteSkill(Long id) {
        skillRepo.deleteById(id);
    }
}