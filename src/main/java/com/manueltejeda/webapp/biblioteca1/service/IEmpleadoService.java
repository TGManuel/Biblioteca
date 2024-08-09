package com.manueltejeda.webapp.biblioteca1.service;

import java.util.List;

import com.manueltejeda.webapp.biblioteca1.model.Empleado;

public interface IEmpleadoService {

    public List<Empleado> listarEmpleado();
    public Empleado buscarEmpleadoPorId(Long id);
    public Boolean guardarEmpleado(Empleado empleado);
    public void eliminarEmpleado(Empleado empleado);
    public Boolean verificarDpiDuplicado(Empleado empleadoNew);
}
