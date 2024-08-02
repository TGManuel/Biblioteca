package com.manueltejeda.webapp.biblioteca1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manueltejeda.webapp.biblioteca1.model.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long>{
    
}
