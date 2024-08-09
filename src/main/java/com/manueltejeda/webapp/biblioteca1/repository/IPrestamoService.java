package com.manueltejeda.webapp.biblioteca1.repository;

import java.util.List;

import com.manueltejeda.webapp.biblioteca1.model.Prestamo;

public interface IPrestamoService {
    public List<Prestamo>listarPrestamos();

    public Prestamo guardarPrestamo(Prestamo prestamo);

    public Prestamo buscarPrestamoPorId(Long id);

    public void eliminarPrestamo(Prestamo prestamo);
}
