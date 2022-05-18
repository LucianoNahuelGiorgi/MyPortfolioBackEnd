package com.project.myportfolio.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class AboutMe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Basic
    private String name;
    private String headline;
    private String professionalResume;
    private String imageUrl;

    public AboutMe() {
    }

    public AboutMe(String name, String headline, String professionalResume, String imageUrl) {
        this.name = name;
        this.headline = headline;
        this.professionalResume = professionalResume;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getProfessionalResume() {
        return professionalResume;
    }

    public void setProfessionalResume(String professionalResume) {
        this.professionalResume = professionalResume;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "AboutMe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", headline='" + headline + '\'' +
                ", professionalResume='" + professionalResume + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}