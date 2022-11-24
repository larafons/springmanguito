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
			 //es conflict??
			 return new ResponseEntity(HttpStatus.CONFLICT);
		 }
	 }
	
	@PostMapping(value = "/user")
	 public ResponseEntity<String> createUserA(@RequestBody PlanComprado emprendedor) {
		 System.out.println(emprendedor);
		return new ResponseEntity<String>("hola", HttpStatus.OK);
	 }
	
	@PostMapping(value = "/login", consumes = {"application/json"}) 
	public ResponseEntity<String> prueba(@RequestBody Emprendedor emprendedor) {
		Emprendedor emp = this.emprendedorService.recuperarByUser(emprendedor.getUsuario());
		if (emp != null && emp.getPasswd().equals(emprendedor.getPasswd())) {
			return new ResponseEntity<String>("Inicio de sesion correcto", HttpStatus.OK);
		}
		return new ResponseEntity<String>("Fallo en inicio de sesion", HttpStatus.FORBIDDEN); //seria forbidden??
	}
}
