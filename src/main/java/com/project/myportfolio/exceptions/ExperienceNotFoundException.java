package com.project.myportfolio.exceptions;

public class ExperienceNotFoundException extends RuntimeException {
    public ExperienceNotFoundException(String message) {
        super(message);
    }
}