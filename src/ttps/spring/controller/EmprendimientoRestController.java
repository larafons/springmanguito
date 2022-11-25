package ttps.spring.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import ttps.spring.model.Donacion;
import ttps.spring.model.Emprendedor;
import ttps.spring.model.Emprendimiento;
import ttps.spring.service.EmprendedorService;
import ttps.spring.service.EmprendimientoService;

@RestController
@RequestMapping(value = "/emprendimientos", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmprendimientoRestController {
	
	@Autowired
	private EmprendimientoService emprendimientoService;

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
	
	@PutMapping("/{id}")
	public ResponseEntity<Emprendimiento> updateEmprendimiento(@PathVariable("id") long id,
						@RequestBody Emprendimiento emprendimiento,@RequestHeader("token") String token){
		System.out.println("Actualizando el emprendimiento con el id " + id);
		
		Emprendimiento emprendimientoActual = emprendimientoService.recuperar(id);
		if(emprendimientoActual == null) {
			System.out.println("El emprendimiento no existe");
			return new ResponseEntity<Emprendimiento>(HttpStatus.NOT_FOUND);
		}
		token = token.replace("123456", "");
		if(emprendimientoActual.getEmprendedor().getId() != Integer.parseInt(token)) {
			System.out.println("No esta autorizado a realizar esta operacion sobre este emprendimiento");
			return new ResponseEntity<Emprendimiento>(HttpStatus.UNAUTHORIZED);
		}
		
		emprendimientoActual.setBanner(emprendimiento.getBanner());
		emprendimientoActual.setCategorias(emprendimiento.getCategorias());
		emprendimientoActual.setDescripcion(emprendimiento.getDescripcion());
		emprendimientoActual.setDonaciones(emprendimiento.getDonaciones());
		emprendimientoActual.setEmprendedor(emprendimiento.getEmprendedor());
		emprendimientoActual.setNombre(emprendimiento.getNombre());
		emprendimientoActual.setPlanesOfrecidos(emprendimiento.getPlanesOfrecidos());
		emprendimientoActual.setPosteo(emprendimiento.getPosteo());
		emprendimientoActual.setPrecioManguito(emprendimiento.getPrecioManguito());
		emprendimientoActual.setUrl(emprendimiento.getUrl());
		emprendimientoActual.setVisualizadorManguitos(emprendimiento.isVisualizadorManguitos());
		emprendimientoActual.setVisualizarDonantes(emprendimiento.isVisualizarDonantes());
		
		emprendimientoService.actualizar(emprendimientoActual);
		return new ResponseEntity<Emprendimiento>(emprendimientoActual, HttpStatus.OK);
	}
	
	@GetMapping("/{id}/donaciones")
	public ResponseEntity<Set<Donacion>> getDonaciones(@PathVariable("id") long id){
		Emprendimiento emp = emprendimientoService.recuperar(id);
		Set<Donacion> lista = (Set<Donacion>) emp.getDonaciones();
		if(lista.isEmpty()) {
			return new ResponseEntity<Set<Donacion>>(lista,HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Set<Donacion>>(lista,HttpStatus.OK);
	}
}