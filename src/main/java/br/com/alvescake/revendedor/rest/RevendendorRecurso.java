package br.com.alvescake.revendedor.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import br.com.alvescake.modelo.Revendedor;
import br.com.alvescake.service.RevendedorService;

@RestController
@RequestMapping(value="/revendedor")
public class RevendendorRecurso {

	@Autowired RevendedorService revendedorService;
	
	
	@RequestMapping(value="/novo", method=RequestMethod.POST,produces={"application/json"})
	@ResponseStatus(HttpStatus.CREATED)
	public void novo(@RequestBody Revendedor revendedor){
		System.out.println("Incluindo nodo Revendedor..."+revendedor.toString());
		revendedorService.novo(revendedor);
	}
	
	@RequestMapping(value="/listar", method=RequestMethod.GET,produces={"application/json"})
	public @ResponseBody ResponseEntity<List<Revendedor>> listar(){
		List<Revendedor> listaRevendedor=revendedorService.listar();
		
		if(listaRevendedor!=null)
		  return new ResponseEntity<List<Revendedor>>(listaRevendedor, HttpStatus.ACCEPTED);
		else
		  return new ResponseEntity<List<Revendedor>>(listaRevendedor, HttpStatus.NO_CONTENT); 	
	}
}
