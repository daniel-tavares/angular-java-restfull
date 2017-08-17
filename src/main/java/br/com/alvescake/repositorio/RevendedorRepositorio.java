package br.com.alvescake.repositorio;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.alvescake.modelo.Revendedor;

@Repository
public class RevendedorRepositorio {
    
	private static List<Revendedor> listaRevendedor;
	private static Long idContador=0l;
	
	public Revendedor novo(Revendedor revendedor) {
		if(listaRevendedor==null) listaRevendedor=new ArrayList<Revendedor>();
		revendedor.setId(++idContador);
		listaRevendedor.add(revendedor);
		return revendedor;
	}
	
	public List<Revendedor> listar(){
		return listaRevendedor;
	}
}
