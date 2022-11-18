package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import ttps.spring.dao.EmprendedorDAO;
import ttps.spring.model.Emprendedor;

@Service
public class EmprendedorServiceImpl implements EmprendedorService {

	@Qualifier("emprendedorDAOJPA")
	private EmprendedorDAO emprendedorDAO;
	
	@Autowired
	public EmprendedorServiceImpl(EmprendedorDAO emp) {
		this.emprendedorDAO = emp;
	}
	
	@Override
	public void actualizar(Emprendedor entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Emprendedor entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Emprendedor borrar(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ResponseEntity<Emprendedor> persistir(Emprendedor emprendedor) {
		if (emprendedorDAO.findByUsuario(emprendedor.getUsuario()) != null) {
			 System.out.println("Ya existe un usuario con nombre " + emprendedor.getUsuario());
			 return new ResponseEntity<Emprendedor>(HttpStatus.CONFLICT); //Código de respuesta 409
		}
		return new ResponseEntity<Emprendedor>(HttpStatus.CREATED);
	}

	@Override
	public Emprendedor recuperar(Serializable id) {
		return emprendedorDAO.recuperar(id);
	}

	@Override
	public List<Emprendedor> recuperarTodos(String column) {
		List<Emprendedor> lista = emprendedorDAO.recuperarTodos(column);
		return lista;
	}

}
