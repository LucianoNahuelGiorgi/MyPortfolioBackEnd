package com.project.myportfolio.services;

import com.project.myportfolio.exceptions.ProjectNotFoundException;
import com.project.myportfolio.models.Project;
import com.project.myportfolio.repositories.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepo projectRepo;

    @Autowired
    public ProjectService(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    public Project addProject(Project project) {
        return projectRepo.save(project);
    }

    public List<Project> findAllProject() {
        return projectRepo.findAll();
    }

    public Project findProjectById(Long id) {
        return projectRepo.findProjectById(id).orElseThrow(()-> new ProjectNotFoundException("Project id: " + id + "was not found"));
    }

    public Project updateProject(Project project) {
        return projectRepo.save(project);
    }

    public void deleteProject(Long id) {
        projectRepo.deleteById(id);
    }
}