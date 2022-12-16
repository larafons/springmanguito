package ttps.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ttps.spring.service.CategoriaService;
import ttps.spring.model.Categoria;
import ttps.spring.model.Emprendimiento;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(value = "/categorias", produces = MediaType.APPLICATION_JSON_VALUE)
public class CategoriaRestController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getCategoriaBy(@PathVariable("id") long id) {
		System.out.println("Obteniendo la categoria con el id " + id);
		Categoria cat = categoriaService.recuperar(id);
		if (cat == null) {
			System.out.println("Categoria con el id "+ id + " no encontrada");
			return new ResponseEntity<Categoria>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Categoria>(cat, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll() {
		List<Categoria> cat = categoriaService.recuperarTodos("nombre");
		return new ResponseEntity<List<Categoria>>(cat, HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Categoria> updateCategoria(@PathVariable("id") long id,
						@RequestBody Categoria categoria/*, @RequestHeader("token") String token*/){
		System.out.println("Actualizando la categoria con el id " + id);
		
		Categoria categoriaActual = categoriaService.recuperar(id);
		if(categoriaActual == null) { 
			System.out.println("La categoria no existe");
			return new ResponseEntity<Categoria>(HttpStatus.NOT_FOUND);
		}
		//token = token.replace("123456", "");
		/*if(emprendimientoActual.getEmprendedor().getId() != Integer.parseInt(token)) {
			System.out.println("No esta autorizado a realizar esta operacion sobre este emprendimiento");
			return new ResponseEntity<Categoria>(HttpStatus.UNAUTHORIZED);
		}*/
		
		categoriaActual.setNombre(categoria.getNombre());
		
		categoriaService.actualizar(categoriaActual);
		return new ResponseEntity<Categoria>(categoriaActual, HttpStatus.OK);
	}
	
	//eliminar??
}
