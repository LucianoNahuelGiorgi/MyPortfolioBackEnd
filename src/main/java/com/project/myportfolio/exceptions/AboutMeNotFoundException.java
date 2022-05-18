package com.project.myportfolio.exceptions;

public class AboutMeNotFoundException extends RuntimeException {
    public AboutMeNotFoundException(String message) {
        super(message);
    }
}