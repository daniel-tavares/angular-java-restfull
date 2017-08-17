package br.com.alvescake.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alvescake.modelo.Revendedor;
import br.com.alvescake.repositorio.RevendedorRepositorio;

@Service
public class RevendedorService {

	@Autowired RevendedorRepositorio revendedorRepositorio;
	
	
	public Revendedor novo(Revendedor revendedor) {
        return revendedorRepositorio.novo(revendedor);	
	}
	
	public List<Revendedor> listar() {
        return revendedorRepositorio.listar();	
	}
}
