package com.project.myportfolio.services;

import com.project.myportfolio.exceptions.HeaderNotFoundException;
import com.project.myportfolio.models.Header;
import com.project.myportfolio.repositories.HeaderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeaderService {
    private final HeaderRepo headerRepo;

    @Autowired
    public HeaderService(HeaderRepo headerRepo) {
        this.headerRepo = headerRepo;
    }

    public Header addHeader(Header header) {
        return headerRepo.save(header);
    }

    public List<Header> findAllHeader() {
        return headerRepo.findAll();
    }

    public Header findHeaderById(Long id) {
        return headerRepo.findHeaderById(id).orElseThrow(()-> new HeaderNotFoundException("Header id: " + id + "was not found"));
    }

    public Header updateHeader(Header header) {
        return headerRepo.save(header);
    }

    public void deleteHeader(Long id) {
        headerRepo.deleteById(id);
    }
}