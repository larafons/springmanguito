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

import ttps.spring.model.Emprendimiento;
import ttps.spring.service.EmprendimientoService;

@RestController
@RequestMapping(value = "/emprendimientos", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmprendimientoRestController {
	private EmprendimientoService emprendimientoService;
	
	@Autowired
	public EmprendimientoRestController(EmprendimientoService emprendimientoService) {
		super();
		this.emprendimientoService = emprendimientoService;
	}


	@GetMapping()
	public ResponseEntity<List<Emprendimiento>> findAll() {
		List<Emprendimiento> emprendedores = emprendimientoService.recuperarTodos("nombre");
		return new ResponseEntity<List<Emprendimiento>>(emprendedores, HttpStatus.OK);
	}

	/*@PostMapping
	 public ResponseEntity<Emprendedor> createUser(@RequestBody Emprendedor user) {
		 System.out.println("Creando el usuario" + user.getUsuario());
		 //if (emprendedorService.isUserExist(user)) {
		//	 System.out.println("Ya existe un usuario con nombre " + user.getUsuario());
		//	 return new ResponseEntity<Emprendedor>(HttpStatus.CONFLICT); //Código de respuesta 409
		 //}
		 Emprendedor user = emprendedorService.persistir(user);
		 return new ResponseEntity<Emprendedor>(user, HttpStatus.CREATED);
	 }*/
}