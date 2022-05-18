package com.project.myportfolio.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Basic
    private String projectName;
    private String imageUrl;
    private Date dateEnd;
    private String description;
    private String linkProject;

    public Project() {
    }

    public Project(String projectName, String imageUrl, Date dateEnd, String description, String linkProject) {
        this.projectName = projectName;
        this.imageUrl = imageUrl;
        this.dateEnd = dateEnd;
        this.description = description;
        this.linkProject = linkProject;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinkProject() {
        return linkProject;
    }

    public void setLinkProject(String linkProject) {
        this.linkProject = linkProject;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", dateEnd=" + dateEnd +
                ", description='" + description + '\'' +
                ", linkProject='" + linkProject + '\'' +
                '}';
    }
}