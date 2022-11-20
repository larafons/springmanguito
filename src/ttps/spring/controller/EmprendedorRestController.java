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

import ttps.spring.model.Categoria;
import ttps.spring.model.*;
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
	public EmprendedorRestController() {
		super();
	}


	@GetMapping
	public ResponseEntity<List<Emprendedor>> findAll() {
		List<Emprendedor> emprendedores = emprendedorService.recuperarTodos("usuario");
		return new ResponseEntity<List<Emprendedor>>(emprendedores, HttpStatus.OK);
	}

	@PostMapping
	 public ResponseEntity<Emprendedor> createUser(@RequestBody Emprendedor emprendedor) {
		 System.out.println("Creando el usuario" + emprendedor.getUsuario());
		 Emprendedor emp = emprendedorService.persistir(emprendedor);
		 if (emp != null) {
			 return new ResponseEntity(emp, HttpStatus.CREATED);
		 } else {
			 //PRUEBA< ESRA MAL
			 return new ResponseEntity(HttpStatus.NO_CONTENT);
		 }
	 }
	
	@PostMapping(value = "/user")
	 public ResponseEntity<String> createUserA(@RequestBody PlanComprado emprendedor) {
		 System.out.println(emprendedor);
		return new ResponseEntity<String>("hola", HttpStatus.OK);
	 }
	
	@PostMapping(value = "/prueba")
	public ResponseEntity<String> prueba(@RequestBody Categoria categoria) {
		System.out.println(categoria);
		return new ResponseEntity<String>("hola", HttpStatus.OK);
	}
}
