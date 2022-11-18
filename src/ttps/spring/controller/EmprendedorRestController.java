package ttps.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import ttps.spring.model.Emprendedor;
import ttps.spring.service.EmprendedorService;

@RestController
@RequestMapping(value = "/emprendedores", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmprendedorRestController {
	private EmprendedorService emprendedorService;
	
	@Autowired
	public EmprendedorRestController(EmprendedorService emprendedorService) {
		super();
		this.emprendedorService = emprendedorService;
	}


	@GetMapping()
	public ResponseEntity<List<Emprendedor>> findAll() {
		List<Emprendedor> emprendedores = emprendedorService.recuperarTodos("usuario");
		return new ResponseEntity<List<Emprendedor>>(emprendedores, HttpStatus.OK);
	}

	@PostMapping
	 public ResponseEntity<Emprendedor> createUser(@RequestBody Emprendedor emprendedor) {
		 System.out.println("Creando el usuario" + emprendedor.getUsuario());
		 Emprendedor emp = emprendedorService.persistir(emprendedor);
		 return new ResponseEntity<Emprendedor>(emp, HttpStatus.CREATED);
	 }
}
