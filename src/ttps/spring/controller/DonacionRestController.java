package ttps.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.model.Donacion;
import ttps.spring.service.DonacionService;

@RestController
@RequestMapping(value = "/donacion", produces = MediaType.APPLICATION_JSON_VALUE)
public class DonacionRestController {
	
	@Autowired
	private DonacionService donacionService;
	
	@PostMapping
	public ResponseEntity<Donacion> donar(@RequestBody Donacion donacion){ //@PathVariable("id") long id, por si hay que agregarlo. Asumo que la donacion viene ya con id de emprendimiento
		System.out.println("Creando la donacion de " + donacion.getNombreDonador());
		Donacion don = donacionService.persistir(donacion);
		if(don != null) {
			return new ResponseEntity<Donacion>(don,HttpStatus.CREATED);
		}
		return new ResponseEntity<Donacion>(HttpStatus.CONFLICT);
	}

}
