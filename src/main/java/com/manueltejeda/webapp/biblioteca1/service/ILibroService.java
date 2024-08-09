package com.manueltejeda.webapp.biblioteca1.service;

import java.util.List;

import com.manueltejeda.webapp.biblioteca1.model.Libro;

public interface ILibroService {
    public List<Libro> listarLibros();
    public Libro guardarLibro(Libro libro);
    public Libro buscarLibroPorId(Long id);
    public void eliminarLibro(Libro libro);
}
