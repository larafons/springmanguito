package ttps.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.dao.AdministradorDAO;
import ttps.spring.dao.EmprendedorDAO;
import ttps.spring.dao.EmprendedorDAOJPA;
import ttps.spring.model.Administrador;
import ttps.spring.model.Credentials;
import ttps.spring.model.Emprendedor;
import ttps.spring.model.Usuario;
import ttps.spring.service.TokenServices;

@RestController
public class LoginController {
	@Autowired
	 private EmprendedorDAO emprendedorDAO;
	@Autowired
	 private AdministradorDAO administradorDAO;
	@Autowired
	 private TokenServices tokenServices;
	
	 private final int EXPIRATION_IN_SEC = 3600;
	 
	 @PostMapping(path = "/auth")
	    public ResponseEntity<Credentials> authenticate(@RequestBody Usuario usuario) {

	        if(isLoginSuccess(usuario.getUsuario(),usuario.getPassword())) {
	            String token = tokenServices.generateToken(usuario.getUsuario(), EXPIRATION_IN_SEC);
	            return ResponseEntity.ok(new Credentials(token, EXPIRATION_IN_SEC, usuario.getUsuario()));
	        } else {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
	        }
	    }

		private boolean isLoginSuccess(String username, String password) {
			Emprendedor e = this.emprendedorDAO.findByUsuario(username);
			if (e != null) {
				return (e.getPasswd().equals(password));
			}
			Administrador a = this.administradorDAO.findByUsuario(username);

			return (a != null && a.getPasswd().equals(password));
		}

	}
