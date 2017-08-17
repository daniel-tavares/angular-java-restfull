package br.com.alvescake.revendedor.rest;
//package br.com.selecaovibe.recursos;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Repository;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import br.com.selecaovibe.modelo.Cliente;
//
//@RestController
//@RequestMapping("/cliente")
//public class ClienteRecurso {
//	Logger logger=LoggerFactory.getLogger(ClienteRecurso.class);
//	
//	@RequestMapping(value = "/{cpfOuEmail}", method = RequestMethod.GET,  produces = {"application/json"})
//	public ResponseEntity<String>  verificaExistenciaRegistroCliente(@PathVariable(value="cpfOuEmail") String cpfOuEmail){
//		logger.info("Acessou aplicacao...");
//		RestTemplate restTemplate = new RestTemplate();
//        Map<String, String> params = new HashMap<String, String>();
//        params.put("cpfOuEmail", cpfOuEmail);
//        ResponseEntity<String> result = restTemplate.getForEntity("http://selecao2017.vibedesenv.com/Cliente/{cpfOuEmail}", String.class,params);
//           
//        return result;
//        
//    }
//	
//	@RequestMapping(value = "/", method = RequestMethod.POST)
//	@ResponseStatus(HttpStatus.CREATED)
//	public ResponseEntity<String> vincularCliente(@RequestBody Cliente cliente){
//		System.out.println("CPF:"+cliente.getCpf());
//		logger.info("Vinculando cliente...");
//		RestTemplate restTemplate = new RestTemplate();
//        Map<String, String> params = new HashMap<String, String>();
//        params.put("Nome", cliente.getNome());
//        params.put("Cpf", cliente.getCpf());
//        params.put("Email", cliente.getEmail());
//        
//        ResponseEntity<String> result =restTemplate.postForEntity("http://selecao2017.vibedesenv.com/Cliente/", params,String.class);
//        return result;
//    }
//	
//	
//	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
//	public ResponseEntity<String> vincularCupom(@PathVariable(value="id") String id){
//		logger.info("Gerando  cupom...");
//		System.out.println("erando log system");
//		RestTemplate restTemplate = new RestTemplate();
//        Map<String, String> params = new HashMap<String, String>();
//        params.put("id", id);
//        ResponseEntity<String> result = restTemplate.exchange("http://selecao2017.vibedesenv.com/Cliente/{id}", HttpMethod.PUT,null,  String.class, params);
//        
//        return result;
//	}
//	
//	@RequestMapping(value="/{id}", method=RequestMethod.DELETE, produces = {"application/json"})
//	public ResponseEntity<String> desvincularCliente(@PathVariable(value="id") String id){
//		logger.info("Gerando  cupom...");
//		System.out.println("delete log system");
//		RestTemplate restTemplate = new RestTemplate();
//        Map<String, String> params = new HashMap<String, String>();
//        params.put("id", id);
//        ResponseEntity<String> result = restTemplate.exchange("http://selecao2017.vibedesenv.com/Cliente/{id}", HttpMethod.DELETE,null,  String.class, params);
//        
//        return result;
//	}
//}
