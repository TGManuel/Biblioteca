package com.manueltejeda.webapp.biblioteca1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manueltejeda.webapp.biblioteca1.model.Empleado;
import com.manueltejeda.webapp.biblioteca1.repository.EmpleadoRepository;

@Service
public class EmpleadoService implements IEmpleadoService{
    @Autowired
    private EmpleadoRepository empleadoRepository;
    @Override
    public List<Empleado> listarEmpleado(){
        return empleadoRepository.findAll();
    }
    @Override
    public Empleado buscarEmpleadoPorId(Long id) {
        return empleadoRepository.findById(id).orElse(null);
    }
    @Override 
    public Boolean guardarEmpleado(Empleado empleado) {
        if(!verificarDpiDuplicado(empleado)){
            empleadoRepository.save(empleado);
            return true;
        }else{
            return false;
        }
    }
    @Override
    public void eliminarEmpleado(Empleado empleado) {
        empleadoRepository.delete(empleado);
    }

    public  Boolean verificarDpiDuplicado(Empleado empleadoNew){
        List<Empleado> empleados = listarEmpleado();
        Boolean flag = false;
        for (Empleado empleado : empleados) {
            if (empleado.getDPI().equals(empleadoNew.getDPI())) {
                flag = true;
            }   
        
        }
        return flag;
    }
}
