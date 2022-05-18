package com.project.myportfolio.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Experience implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Basic
    private String jobPosition;
    private String imageUrl;
    private Date dateIn;
    private Date dateOut;
    private String description;

    public Experience() {
    }

    public Experience(String jobPosition, Date dateIn, Date dateOut, String description) {
        this.jobPosition = jobPosition;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", jobPosition='" + jobPosition + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", dateIn=" + dateIn +
                ", dateOut=" + dateOut +
                ", description='" + description + '\'' +
                '}';
    }
}