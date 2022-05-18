package com.project.myportfolio.controllers;

import com.project.myportfolio.models.Header;
import com.project.myportfolio.services.HeaderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/header")
public class HeaderController {
    private final HeaderService headerService;

    public HeaderController(HeaderService headerService) {
        this.headerService = headerService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Header>> getAllHeader () {
        List<Header> header = headerService.findAllHeader();
        return new ResponseEntity<>(header, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Header> getHeaderById(@PathVariable("id") Long id) {
        Header header = headerService.findHeaderById(id);
        return new ResponseEntity<>(header, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Header> addHeader(@RequestBody Header header) {
        Header addHeader = headerService.addHeader(header);
        return new ResponseEntity<>(addHeader, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Header> updateHeader(@RequestBody Header header) {
        Header updateHeader = headerService.updateHeader(header);
        return new ResponseEntity<>(updateHeader, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteHeader(@PathVariable("id") Long id) {
        headerService.deleteHeader(id);
    }
}