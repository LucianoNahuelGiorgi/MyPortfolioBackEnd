package com.project.myportfolio.repositories;

import com.project.myportfolio.models.Header;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HeaderRepo extends JpaRepository<Header, Long> {
    Optional<Header> findHeaderById(Long id);
}