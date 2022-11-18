package ttps.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	public EmprendimientoRestController() {
		super();
	}

	@GetMapping("/hello")
	public ResponseEntity<String> hello() {
		return new ResponseEntity<String>("Hello world", HttpStatus.OK);
		
	}

	@GetMapping("/{id}")
	public ResponseEntity<Emprendimiento> getEmprendimientoBy(@PathVariable("id") long id) {
		System.out.println("Obteniendo el emprendimiento con el id " + id);
		Emprendimiento emp = emprendimientoService.recuperar(id);
		if(emp == null) {
			System.out.println("Emprendimiento con el id "+ id + " no encontrado");
			return new ResponseEntity<Emprendimiento>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Emprendimiento>(emp, HttpStatus.OK);
		
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