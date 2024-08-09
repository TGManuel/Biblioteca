package com.manueltejeda.webapp.biblioteca1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manueltejeda.webapp.biblioteca1.model.Prestamo;
import com.manueltejeda.webapp.biblioteca1.repository.IPrestamoService;
import com.manueltejeda.webapp.biblioteca1.repository.PrestamoRepository;

@Service
public class PrestamoService implements IPrestamoService{
    @Autowired
    PrestamoRepository prestamoRepository;

    @Override
    public Prestamo buscarPrestamoPorId(Long id) {
        return prestamoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarPrestamo(Prestamo prestamo) {
        prestamoRepository.delete(prestamo);
    }

    @Override
    public Prestamo guardarPrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @Override
    public List<Prestamo> listarPrestamos() {
        return prestamoRepository.findAll();
    }
}
