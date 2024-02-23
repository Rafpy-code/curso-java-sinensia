package com.clientes.springboot.backend.apirest.models.services;

import java.util.List;
import com.clientes.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public Cliente save(Cliente cliente);
	public Cliente findById(Long id);
	public List<Cliente> findAll();
	public void delete(Long id);

}
