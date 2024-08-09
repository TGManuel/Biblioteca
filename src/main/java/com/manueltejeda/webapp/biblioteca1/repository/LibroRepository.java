package com.manueltejeda.webapp.biblioteca1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manueltejeda.webapp.biblioteca1.model.Libro;

public interface LibroRepository extends JpaRepository <Libro, Long>{

    
} 
