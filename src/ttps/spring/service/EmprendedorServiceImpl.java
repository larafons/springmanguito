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
		this.emprendedorDAO.actualizar(entity);
	}

	@Override
	public void borrar(Emprendedor entity) {
		this.emprendedorDAO.borrar(entity);
	}

	@Override
	public Emprendedor borrar(Serializable id) {
		return this.emprendedorDAO.borrar(id);
	}

	@Override
	public boolean existe(Serializable id) {
		return this.emprendedorDAO.existe(id);
	}

	@Override
	public Emprendedor persistir(Emprendedor emprendedor) {
		if (emprendedorDAO.findByUsuario(emprendedor.getUsuario()) != null) {
			 System.out.println("Ya existe un usuario con nombre " + emprendedor.getUsuario());
			 return null; //Código de respuesta 409 -> en controller?
		}
		return emprendedorDAO.persistir(emprendedor);
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

	@Override
	public Emprendedor recuperarByUser(String usuario) {
		Emprendedor emprendedor= emprendedorDAO.findByUsuario(usuario);
		if (emprendedor != null) {
			return emprendedor;
		}
		return null;
	}

}
