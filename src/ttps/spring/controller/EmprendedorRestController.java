package ttps.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.model.Emprendedor;
import ttps.spring.model.PlanComprado;
import ttps.spring.model.Usuario;
import ttps.spring.service.EmprendedorService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(value = "/emprendedores", produces = "application/json")
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
	
	//Registración de usuario/emprendimiento nuevo
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity<Emprendedor> createUser(@RequestBody Emprendedor emprendedor) {
		 System.out.println("Creando el usuario " + emprendedor.getUsuario());
		 //emprendedor.getEmprendimiento().setEmprendedor(emprendedor); //ESTO ES LO QUE NO ANDA;
		 Emprendedor emp = emprendedorService.persistir(emprendedor);
		 if (emp != null) {
			 return new ResponseEntity<Emprendedor>(emp, HttpStatus.CREATED);
		 } else {
			 return new ResponseEntity<Emprendedor>(HttpStatus.CONFLICT);
		 }
	 }
	
	//Login del sistema
	/*@PostMapping(value = "/login", consumes = {"application/json"}) 
	public ResponseEntity<String> login(@RequestBody Usuario usuario) {
		Emprendedor emp = this.emprendedorService.recuperarByUser(usuario.getUsuario());
		if (emp != null && emp.getPasswd().equals(usuario.getPassword())) {
			System.out.println("Iniciando sesion "+usuario.getUsuario());
			return new ResponseEntity<String>("OK", HttpStatus.OK);
		}
		return new ResponseEntity<String>("401", HttpStatus.UNAUTHORIZED); 
	}*/
}
