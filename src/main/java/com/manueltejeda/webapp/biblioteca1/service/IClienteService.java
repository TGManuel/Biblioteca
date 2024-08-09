package com.manueltejeda.webapp.biblioteca1.service;

import java.util.List;

import com.manueltejeda.webapp.biblioteca1.model.Cliente;

public interface IClienteService {

    public List<Cliente> listarCliente();

    public Cliente buscarClientePorId(Long DPI);

    public Cliente guardarCliente(Cliente cliente);

    public void eliminarCliente(Cliente cliente);
}
